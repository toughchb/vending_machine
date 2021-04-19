package machine.coin;

import machine.common.Currency;

import java.util.HashMap;
import java.util.Map;

public class ECoinInserter implements CoinInserter{

    private final Currency supportCurrency = Currency.USD;
    private final Map<Integer,String> coinKinds = new HashMap<Integer,String>()
    {{
        put(1,"USD_0.5");
        put(2,"USD_0.25");
        put(3,"USD_0.1");
    }};
    private final Map<String,Double> coinMoney = new HashMap<String,Double>()
    {{
        put("USD_0.5",0.5);
        put("USD_0.25",0.25);
        put("USD_0.1",0.1);
    }};

    @Override
    public Currency getSupportCurrency() {
        return supportCurrency;
    }

    @Override
    public boolean checkAvailable(int opt) {
        return coinKinds.containsKey(opt);
    }

    @Override
    public Map<Integer,String> getCoinKinds() {
        return coinKinds;
    }

    public String findKindByOpt(int opt) {
        return coinKinds.get(opt);
    }

    @Override
    public double getMoneyAmount(String moneyKey) {
        return coinMoney.get(moneyKey);
    }
}
