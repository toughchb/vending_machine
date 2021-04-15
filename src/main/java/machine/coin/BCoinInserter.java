package machine.coin;

import java.util.Arrays;
import java.util.List;

public class BCoinInserter implements CoinInserter{

    private List<String> available = Arrays.asList("KRW_50","KRW_100","KRW_500");

    boolean checkAvailable(String money) {
       return available.contains(money);
    }
}
