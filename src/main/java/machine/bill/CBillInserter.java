package machine.bill;

import machine.common.Currency;

import java.util.HashMap;
import java.util.Map;

public class CBillInserter implements BillInserter{

    private final Currency supportCurrency = Currency.KRW;
    private final Map<Integer,String> billKinds = new HashMap<Integer,String>()
    {{
        put(1,"KRW_10000");
        put(2,"KRW_5000");
        put(3,"KRW_1000");
    }};
    private final Map<String,Double> billMoney = new HashMap<String,Double>()
    {{
        put("KRW_10000",10000.0);
        put("KRW_5000",5000.0);
        put("KRW_1000",1000.0);
    }};

    @Override
    public Currency getSupportCurrency() {
        return supportCurrency;
    }

    @Override
    public boolean checkAvailable(int opt) {
        return billKinds.containsKey(opt);
    }

    @Override
    public Map<Integer, String> getBillKinds() {
        return billKinds;
    }

    @Override
    public String findKindByOpt(int opt) {
        return billKinds.get(opt);
    }

    @Override
    public double getMoneyAmount(String moneyKey) {
        return billMoney.get(moneyKey);
    }
}
