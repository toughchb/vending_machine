package machine.bill;

import java.util.HashMap;
import java.util.Map;

public class EBillInserter implements BillInserter{

    private final Map<Integer,String> billKinds = new HashMap<Integer,String>()
    {{
        put(1,"USD_100");
        put(2,"USD_10");
        put(3,"USD_1");
    }};
    private final Map<String,Double> billMoney = new HashMap<String,Double>()
    {{
        put("USD_100",100.0);
        put("USD_10",10.0);
        put("USD_1",1.0);
    }};

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
