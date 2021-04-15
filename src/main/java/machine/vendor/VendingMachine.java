package machine.vendor;

public interface VendingMachine {

    void insertMoney(int money);
    int returnChange();
    void selectProduct();

}
