package machine.display.languages;

public class KoreanMessages implements Messages{

    @Override
    public String getLanguageString() {
        return "KOREAN";
    }


    @Override
    public String getMainMenu() {
        return "\n<< 메뉴를 선택 하세요 >>\n" +
                "1. 돈 삽입\n" +
                "2. 거스름돈 반환\n" +
                "3. 물건 선택\n" +
                "0. 나가기\n" +
                ">>";
    }

    @Override
    public String getCoinKindMenu() {
        return "\n<< 삽입할 동전의 금액을 선택 하세요 >>\n";
    }

    @Override
    public String getBillKindMenu() {
        return "\n<< 삽입할 지폐의 금액 선택 하세요 >>\n";
   }

    @Override
    public String getSelectMoneyKindMenu() {
        return "\n<< 삽입할 돈의 종류를 선택 하세요 >>\n" +
                "1. 동전\n" +
                "2. 지폐\n" +
                "0. 나가기\n" +
                ">>";
    }

    @Override
    public String getReturnChange() {
        return "\n<< 거스름돈을 반환 합니다 >>\n" +
                "안녕히 가세요~";
    }

    @Override
    public String getCoinSelectError() {
        return "잘못된 동전의 선택 입니다.";
    }

    @Override
    public String getBillSelectError() {
        return "잘못된 지폐의 선택 입니다.";
    }

    @Override
    public String getProductSelectError() {
        return "잘못된 상품의 선택 입니다.";
    }

    @Override
    public String getSelectProductMenu() {
        return "\n<< 원하는 상품을 선택하세요. >>";
    }

    @Override
    public String getNotEnoughMoneyError() {
        return "돈이 모자랍니다!!";
    }
}
