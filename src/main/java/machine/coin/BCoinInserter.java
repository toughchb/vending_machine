package machine.coin;

import java.util.Arrays;
import java.util.List;

public class BCoinInserter implements CoinInserter{

    private static BCoinInserter instance = new BCoinInserter();
    private BCoinInserter() {

    }

    public static BCoinInserter getInstance() {
        return instance;
    }

    private static List<String> available = Arrays.asList("KRW_50","KRW_100","KRW_500");

    boolean checkAvailable(String money) {
       return available.contains(money);
    }

    public static List<String> getAvailable() {
        return available;
    }
}
