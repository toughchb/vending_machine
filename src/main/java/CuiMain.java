import config.AppConfig;
import machine.vendor.VendingMachine;

import java.util.Scanner;

public class CuiMain {

    public static void main(String[] args) {

        AppConfig ac = new AppConfig();

        VendingMachine vm = ac.vendingMachine();

        Scanner sc = new Scanner(System.in);

        vm.start();
        int opt = sc.nextInt();


    }
}
