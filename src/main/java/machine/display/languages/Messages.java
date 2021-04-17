package machine.display.languages;

public abstract class Messages {

    //private final String languageMenu;

    private String languageMenu;
    private String mainMenu;
    private String insertMoneyMenu;
    private String returnChange;

    public abstract String getLanguageString();

    public abstract String getLanguageMenu() ;

    public abstract String getMainMenu();

    public abstract String getInsertMoneyMenu();

    public abstract String getCoinKindMenu();

    public abstract String getBillKindMenu();

    public abstract String getReturnChange();
}
