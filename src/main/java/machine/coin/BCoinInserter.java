package machine.coin;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BCoinInserter implements CoinInserter{

    private final Map<Integer,String> coinKinds = new HashMap<Integer,String>()
    {{
        put(1,"KRW_500");
        put(2,"KRW_100");
        put(3,"KRW_50");
    }};
    private final Map<String,Integer> coinMoney = new HashMap<String,Integer>()
    {{
        put("KRW_500",500);
        put("KRW_100",100);
        put("KRW_50",50);
    }};


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

    public int getMoneyAmount(String moneyKey) {
        return coinMoney.get(moneyKey);
    }
}
