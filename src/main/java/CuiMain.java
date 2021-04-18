import config.AppConfig;
import machine.vendor.VendingMachine;

import java.util.Scanner;

public class CuiMain {

    public static void main(String[] args) {

        AppConfig ac = new AppConfig();

        VendingMachine vm = ac.vendingMachine();

        Scanner sc = new Scanner(System.in);
        vm.initialize();


        while (true) {
            vm.start(); //TODO: 언어 선택을 자판기 떠날때까지 한번만 할수 있게 변경해야함
            String input = sc.next();
            int opt = Integer.parseInt(input);
            /**
             * "select menu\n" +
             *  "1. insert money\n" +
             *  "2. return change\n" +
             *  "3. select product\n" +
             *  "0. exit\n"
             */
            switch (opt) {
                case 1:
                    vm.insertMoney();
                    break;
                case 2:
                    vm.returnChange();
                    break;
                case 3:
                    vm.selectProduct();
                    break;
                case 0:
                    return;
            }
        }
    }

}
