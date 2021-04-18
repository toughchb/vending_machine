package machine.coin;

import java.util.Map;

public interface CoinInserter {
    boolean checkAvailable(int opt);
    /* for displaying */
    Map<Integer,String> getCoinKinds();
    String findKindByOpt(int opt);
    int getMoneyAmount(String moneyKey);
}
