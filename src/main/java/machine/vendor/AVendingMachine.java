package machine.vendor;

import machine.bill.BillInserter;
import machine.coin.CoinInserter;
import machine.display.Display;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AVendingMachine implements VendingMachine {

    private double money;
    private final Map<String, Double> productsAndPrices = new HashMap<String, Double>(){{
        put("캔음료", 500.0);
        put("신문", 1000.0);
    }};
    private final Map<Integer,String> optAndProducts = new HashMap<Integer,String>(){{
        put(1,"캔음료");
        put(2, "신문");
    }};
    private Map<Integer, String> coinKinds;// ci 에서 받아올 coin 종류 맵
    private Map<Integer, String> billKinds;// bi 에서 받아올 bill 종류 맵


    private final Display display;
    private final CoinInserter ci;
    private final BillInserter bi;


    public AVendingMachine(Display display, CoinInserter ci, BillInserter bi) {
        this.display = display;
        this.ci = ci;
        this.bi = bi;
    }

    @Override
    public void initialize() {
        money = 0;
        coinKinds = ci.getCoinKinds();
        display.setCoinKinds(coinKinds);
        billKinds = bi.getBillKinds();
        display.setBillKinds(billKinds);
    }

    @Override
    public void start() {
        display.selectLanguage();
        display.printMainMenu();
    }


    @Override
    public void insertMoney() {
        /**
         * "select money kind\n" +
         * "1. coins\n" +
         * "2. bills\n" +
         * "0. exit\n" +
         */
        display.printInsertMoneyMenu();

        int opt = getOptFromInput();

        switch (opt){
            case 1:
                selectCoinKind();
                break;
            case 2:
                selectBillKind();
                break;
        }
    }

    @Override
    public void selectCoinKind() {
        display.printSelectCoinKindMenu();
        int opt = getOptFromInput();

        if (ci.checkAvailable(opt)) {
            money += ci.getMoneyAmount(ci.findKindByOpt(opt));
        } else if (opt == 0) {
            return;
        } else {
            display.printCoinSelectError();
        }
    }

    @Override
    public void selectBillKind(){
        display.printSelectBillKindMenu();
        int opt = getOptFromInput();

        if (bi.checkAvailable(opt)) {
            money += bi.getMoneyAmount(bi.findKindByOpt(opt));
        } else if (opt == 0) {
            return;
        } else {
            display.printBillSelectError();
        }
    }

    private int getOptFromInput() {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        return Integer.parseInt(input);
    }

    @Override
    public void returnChange() {
        display.printReturnChange();
        money = 0;
        return ;
    }

    @Override
    public void selectProduct() {
        display.printSelectProductMenu(optAndProducts, money);

        int opt = getOptFromInput();

        if(optAndProducts.containsKey(opt)){
            // money 랑 비교 물품의 가격이 money 보다 크면에러
            double selectedPrice = productsAndPrices.get(optAndProducts.get(opt));
            if (selectedPrice > money) {
                display.printNotEnoughMoneyError();
            }
            else {
                money -= selectedPrice;
            }
        }
        else {
            display.printProductSelectError();
        }
    }
}
