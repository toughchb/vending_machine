package machine.display;

import machine.display.languages.EngMessages;
import machine.display.languages.Messages;

public class DDisplay extends Display{
    Messages messages = new EngMessages();
    @Override
    void printMainMenu() {
        messages.getLanguageMenu();
    }

    @Override
    void printInsertMoneyMenu() {

    }

    @Override
    void printReturnChange() {

    }

    @Override
    void printSelectProductMenu() {

    }
}
