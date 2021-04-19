package machine.vendor;

public interface VendingMachine {

    void initialize();
    void start();
    void insertMoney();
    void returnChange();
    void selectProduct();
    void selectCoinKind();
    void selectBillKind();
    void menuSelectionError();
    boolean checkInsertersCurrency();
    boolean checkMachinesCurrency();
}
