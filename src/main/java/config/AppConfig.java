package config;

import machine.bill.BillInserter;
import machine.bill.CBillInserter;
import machine.coin.BCoinInserter;
import machine.coin.CoinInserter;
import machine.display.Display;
import machine.display.DDisplay;
import machine.vendor.VendingMachine;
import machine.vendor.AVendingMachine;

public class AppConfig {

    CoinInserter coinInserter(){
        return new BCoinInserter();
    }

    BillInserter billInserter() {
        return new CBillInserter();
    }

    Display display() {
        return new DDisplay();
    }

    public VendingMachine vendingMachine(){
        return new AVendingMachine(display(), coinInserter(), billInserter());
    }

}
