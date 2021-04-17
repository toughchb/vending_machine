package machine.coin;

import java.util.Map;

public interface CoinInserter {

    boolean checkAvailable(int opt);
    Map<Integer,String> getCoinKind();
    int getMoneyAmount(String moneyKey);
}
