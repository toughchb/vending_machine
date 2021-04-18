package machine.bill;

import java.util.Map;

public interface BillInserter {
    boolean checkAvailable(int opt);
    /* for displaying */
    Map<Integer,String> getBillKinds();
    String findKindByOpt(int opt);
    int getMoneyAmount(String moneyKey);
}
