package machine.display.languages;

public class EnglishMessages implements Messages{

    @Override
    public String getLanguageString() {
        return "ENGLISH";
    }

    @Override
    public String getMainMenu() {
        return "\n<< select menu >>\n" +
                "1. insert money\n" +
                "2. return change\n" +
                "3. select product\n" +
                "0. exit\n" +
                ">>";
    }

    @Override
    public String getSelectMoneyKindMenu() {
        return "\n<< select money kind >>\n" +
                "1. coins\n" +
                "2. bills\n" +
                "0. exit\n" +
                ">>";
    }

    @Override
    public String getCoinKindMenu() {
        return "\n<< select coin kind >>\n";
    }

    @Override
    public String getBillKindMenu() {
        return "\n<< select bill kind >>\n";
    }

    @Override
    public String getReturnChange() {
        return "return change\n" +
                "bye~";
    }

    @Override
    public String getMainMenuSelectError() {
        return "Main Menu Select Error";
    }

    @Override
    public String getMoneyMenuSelectError() {
        return "Money Menu Select Error";
    }

    @Override
    public String getCoinSelectError() {
        return "Coin Select Error";
    }

    @Override
    public String getBillSelectError() {
        return "Bill Select Error";
    }

    @Override
    public String getProductSelectError() {
        return "Product Select Error";
    }

    @Override
    public String getSelectProductMenu() {
        return "\n<< select product. >>";
    }

    @Override
    public String getNotEnoughMoneyError(){
        return "Not Enough Money!!";
    }

    @Override
    public String getInsertersCurrencyNotEqual() {
        return "Coin, Bill Inserters Currency Is Not Equal!!";
    }

    @Override
    public String getMachinesCurrencyNotEqual() {
        return "Coin, Bill Inserters, Vending Machine Currency Is Not Equal!!";
    }
}
