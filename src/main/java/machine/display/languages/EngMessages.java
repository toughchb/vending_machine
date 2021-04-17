package machine.display.languages;

public class EngMessages extends Messages{

    @Override
    public String getLanguageString() {
        return "ENGLISH";
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
        return "select money kind\n" +
                "1. coins" +
                "2. bills" +
                "0. exit";
    }

    @Override
    public String getCoinKindMenu() {
        return "select coin kind\n";

    }

    @Override
    public String getBillKindMenu() {
        return "select bill kind\n";
    }

    @Override
    public String getReturnChange() {
        return "return change\n" +
                "bye~";
    }
}
