package machine.coin;

import machine.common.Currency;

import java.util.Map;

public interface CoinInserter {
    boolean checkAvailable(int opt);
    /* for displaying */
    Map<Integer,String> getCoinKinds();
    String findKindByOpt(int opt);
    double getMoneyAmount(String moneyKey);
    Currency getSupportCurrency();
}
