package machine.display;

import machine.display.languages.EngMessages;
import machine.display.languages.KoreanMessages;
import machine.display.languages.Messages;

import java.util.*;

public abstract class Display {

    protected Messages messages;

    private static Map<Integer, Messages> langOptions =  new HashMap<>();

    static {
        langOptions.put(1, new KoreanMessages());
        langOptions.put(2, new EngMessages());
    }

    public void selectLanguage() {
        System.out.println("\n<< select Language >>");

        for (int i = 1; i <= langOptions.size(); i++) {
            System.out.println((i) + ". " + langOptions.get(i).getLanguageString());
        }
        System.out.println("0. exit");
        System.out.println(">>");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        try {
            int opt = Integer.parseInt(input);

            switch (opt) {
                case 1:
                    this.messages = langOptions.get(1);
                    break;
                case 2:
                    this.messages = langOptions.get(2);
                    break;
                case 0:
                    // TODO: exit
                    break;
                default:
                    break;

            }
        } catch (NumberFormatException e) {
            System.err.println("input is not available");
        }
    }

    abstract public void printMainMenu();

    abstract public void printInsertMoneyMenu();

    abstract public void printSelectCoinKindMenu();

    public abstract void printSelectBillKindMenu();

    abstract public void printReturnChange();

    abstract public void printSelectProductMenu(Map<Integer,String> productOptions, double money);

    abstract public void setCoinKinds(Map<Integer, String> coinKinds);

    abstract public void setBillKinds(Map<Integer, String> coinKinds);

    abstract public void printCoinSelectError();

    abstract public void printBillSelectError();

    abstract public void printProductSelectError();

    abstract public void printNotEnoughMoneyError();

}
