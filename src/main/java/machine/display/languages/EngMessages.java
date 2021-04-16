package machine.display.languages;

public class EngMessages extends Messages{

    @Override
    public String getLanguageString() {
        return "KOREAN";
    }

    @Override
    public String getLanguageMenu() {
        return "select language\n" +
                "1. korean\n" +
                "2. english\n" +
                "0. exit\n" +
                ">>";
    }

    @Override
    public String getMainMenu() {
        return "select menu\n" +
                "1. insert money\n" +
                "2. return change\n" +
                "3. select product\n" +
                "0. exit\n" +
                ">>";
    }

    @Override
    public String getInsertMoneyMenu() {
        return null;
    }

    @Override
    public String getReturnChange() {
        return "return change\n" +
                "bye~";
    }
}
