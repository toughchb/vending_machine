package machine.display;

import machine.display.languages.EngMessages;
import machine.display.languages.KoreanMessages;
import machine.display.languages.Messages;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public abstract class Display {

    protected Messages messages;

    private static Map<Integer, Messages> langOptions =  new HashMap<>();

    static {
        langOptions.put(1, new KoreanMessages());
        langOptions.put(2, new EngMessages());
    }



    public void selectLanguage() {
        System.out.println("select Language");
        //Languages[] values = Languages.values();

        for (int i = 0; i < langOptions.size(); i++) {
            System.out.println((i+1) + ". " + langOptions.get(i).getLanguageString());
            System.out.println("0. exit");
        }
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
                    break;
                default:
                    break;

            }
        } catch (NumberFormatException e) {
            System.err.println("input is not available");
        }


    }

    abstract void printMainMenu();

    abstract void printInsertMoneyMenu();

    abstract void printReturnChange();

    abstract void printSelectProductMenu();

}
