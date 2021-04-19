package machine.vendor;

import machine.bill.BillInserter;
import machine.coin.CoinInserter;
import machine.common.Currency;
import machine.display.Display;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EVendingMachine implements VendingMachine {

    private final Currency supportCurrency = Currency.USD;

    private double money;
    private boolean LANGUAGE_SELECTED = false;

    private final Map<String, Double> productsAndPrices = new HashMap<String, Double>(){{
        put("Coke", 5.0);
        put("NewsPaper", 10.0);
    }};
    private final Map<Integer,String> optAndProducts = new HashMap<Integer,String>(){{
        put(1,"Coke");
        put(2, "NewsPaper");
    }};
    private Map<Integer, String> coinKinds;// ci 에서 받아올 coin 종류 맵
    private Map<Integer, String> billKinds;// bi 에서 받아올 bill 종류 맵


    private final Display display;
    private final CoinInserter ci;
    private final BillInserter bi;


    public EVendingMachine(Display display, CoinInserter ci, BillInserter bi) {
        this.display = display;
        this.ci = ci;
        this.bi = bi;
    }

    @Override
    public boolean checkInsertersCurrency() {
        if (ci.getSupportCurrency() == bi.getSupportCurrency()) {
            return true;
        }
        else {
            return false;
        }

    }

    @Override
    public boolean checkMachinesCurrency() {
        if (checkInsertersCurrency()) {
            if(supportCurrency == ci.getSupportCurrency()) return true;
            else {
                display.printMachinesCurrencyNotEqualError();
                return false;
            }
        } else {
            display.printInsertersCurrencyNotEqualError();
            return false;
        }
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
        if(!LANGUAGE_SELECTED){
        display.selectLanguage();
            LANGUAGE_SELECTED = true;
        }
        display.printMainMenu();
    }

    @Override
    public void menuSelectionError() {
        display.printMainMenuSelectError();
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
            default:
                display.printMoneyMenuSelectError();
                return;
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
        LANGUAGE_SELECTED = false;
        return ;
    }

    @Override
    public void selectProduct() {
        display.printSelectProductMenu(optAndProducts, productsAndPrices, money);

        int opt = getOptFromInput();

        if(optAndProducts.containsKey(opt)){
            double selectedPrice = productsAndPrices.get(optAndProducts.get(opt));
            if (selectedPrice > money) {
                display.printNotEnoughMoneyError();
            }
            else {
                money -= selectedPrice;
            }
        } else if (opt == 0) {
            return;
        } else {
            display.printProductSelectError();
        }
    }
}
