import config.AppConfig;
import machine.vendor.VendingMachine;

public class CuiMain {

    public static void main(String[] args) {

        AppConfig ac = new AppConfig();

        VendingMachine vm = ac.vendingMachine();




    }
}
