package machine.vendor;

import machine.bill.BillInserter;
import machine.coin.CoinInserter;
import machine.display.Display;

import java.util.Map;
import java.util.Scanner;

public class AVendingMachine implements VendingMachine {

    private int money;
    private Map<String, Integer> products;

    private final Display display;
    private final CoinInserter ci;
    private final BillInserter bi;

    //TODO: ci 에서 받아올 coin 종류 맵


    public AVendingMachine(Display display, CoinInserter ci, BillInserter bi) {
        this.display = display;
        this.ci = ci;
        this.bi = bi;
    }

    public void initialize() {
        products.put("캔음료", 500);
        products.put("신문", 1000);

    }

    public void start() {
        display.selectLanguage();
        display.printMainMenu();
    }

    @Override
    public void insertMoney(int money) {
        display.printInsertMoneyMenu();

        }

    @Override
    public int returnChange() {
        return money = 0;
    }

    @Override
    public void selectProduct() {

    }
}
