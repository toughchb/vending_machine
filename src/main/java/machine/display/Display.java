package machine.display;

import machine.display.languages.Languages;
import machine.display.languages.Messages;

import java.util.Scanner;

public abstract class Display {

    private Messages messages;



    public void selectLanguage() {
        System.out.println("select Language");
        Languages[] values = Languages.values();

        for (int i = 0; i < values.length; i++) {
            System.out.println((i+1) + ". " + values[i].toString());
            System.out.println("0. exit");
        }
        System.out.println(">>");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        try {
            int opt = Integer.parseInt(input);

            switch (opt) {
                case 1:
                    //set language
                    //new EngMessage();
                    break;
                case 2:
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
