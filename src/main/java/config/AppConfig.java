package config;

import machine.bill.BillInserter;
import machine.bill.CBillInserter;
import machine.bill.EBillInserter;
import machine.coin.*;
import machine.display.Display;
import machine.display.DDisplay;
import machine.vendor.EVendingMachine;
import machine.vendor.VendingMachine;
import machine.vendor.AVendingMachine;

public class AppConfig {

    CoinInserter coinInserter(){
        return new BCoinInserter();
//        return new ECoinInserter();
    }

    BillInserter billInserter() {
        return new CBillInserter();
//        return new EBillInserter();
    }

    Display display() {
        return new DDisplay();
    }

    public VendingMachine vendingMachine(){
        return new AVendingMachine(display(), coinInserter(), billInserter());
//        return new EVendingMachine(display(), coinInserter(), billInserter());
    }

}
