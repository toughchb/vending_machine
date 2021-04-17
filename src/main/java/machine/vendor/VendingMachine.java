package machine.vendor;

public interface VendingMachine {

    void initialize();
    void start();
    void insertMoney(int money);
    int returnChange();
    void selectProduct();

}
