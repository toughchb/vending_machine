import config.AppConfig;
import machine.vendor.VendingMachine;

import java.util.Scanner;

public class CuiMain {

    public static void main(String[] args) {

        AppConfig ac = new AppConfig();

        VendingMachine vm = ac.vendingMachine();

        if(!vm.checkMachinesCurrency()){
            return;
        }
        vm.initialize();

        Scanner sc = new Scanner(System.in);

            while (true) {
                try {
                vm.start();
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
                        vm.returnChange(); // 거스름돈 반환하면 언어 다시 언어 선택해야함
                        break;
                    case 3:
                        vm.selectProduct();
                        break;
                    case 0:
                        return;
                }
                } catch (NumberFormatException e) {
                    vm.menuSelectionError();
                }
            }

    }

}
