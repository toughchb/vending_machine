package machine.display;

import java.util.Map;

public class DDisplay extends Display{

     Map<Integer, String> coinKinds;
     Map<Integer, String> billKinds;

    @Override
    public void printMainMenu() {
        System.out.println(messages.getMainMenu());
    }

    @Override
    public void printInsertMoneyMenu() {
        System.out.println(messages.getSelectMoneyKindMenu());
    }

    @Override
    public void printSelectCoinKindMenu() {
        System.out.println(messages.getCoinKindMenu());
        printMapValuesAndExit(coinKinds);
    }

    public void printCoinSelectError() {
        System.err.println(messages.getCoinSelectError());
    }

    public void printBillSelectError() {
        System.err.println(messages.getBillSelectError());
    }

    @Override
    public void printReturnChange() {
        System.out.println(messages.getReturnChange());
    }

    @Override
    public void printSelectProductMenu(Map<Integer,String> productOptions, Map<String, Double> productPrice, double money) {
        System.out.println(messages.getSelectProductMenu());
        System.out.println("change money: " + money);
        printProductAndPriceExit(productOptions, productPrice);
    }

    @Override
    public void printNotEnoughMoneyError() {
        System.err.println(messages.getNotEnoughMoneyError());
    }

    @Override
    public void setCoinKinds(Map<Integer, String> coinKinds) {
        this.coinKinds = coinKinds;
    }

    @Override
    public void setBillKinds(Map<Integer, String> billKinds) {
        this.billKinds = billKinds;
    }

    @Override
    public void printSelectBillKindMenu() {
        System.out.println(messages.getBillKindMenu());
        printMapValuesAndExit(billKinds);
    }

    private void printMapValuesAndExit(Map<Integer, String> paramMap) {
        for (Integer key : paramMap.keySet()) {
            System.out.println(key + ". " + paramMap.get(key));
        }
        switch (messages.getLanguageString()) {
            case "KOREAN":
                System.out.println("0. 나가기");
                break;
            case "ENGLISH":
                System.out.println("0. exit");
                break;
            default:
                break;
        }
        System.out.println(">>");
    }

    private void printProductAndPriceExit(Map<Integer, String> paramMap, Map<String, Double> priceMap) {
        for (Integer key : paramMap.keySet()) {
            System.out.println(key + ". " + paramMap.get(key) + ": "+priceMap.get(paramMap.get(key)));
        }
        switch (messages.getLanguageString()) {
            case "KOREAN":
                System.out.println("0. 나가기");
                break;
            case "ENGLISH":
                System.out.println("0. exit");
                break;
            default:
                break;
        }
        System.out.println(">>");
    }

    @Override
    public void printMainMenuSelectError() {
        System.err.println(messages.getMainMenuSelectError());
    }

    @Override
    public void printProductSelectError() {
        System.err.println(messages.getProductSelectError());
    }

    @Override
    public void printInsertersCurrencyNotEqualError() {
        System.err.println(messages.getInsertersCurrencyNotEqual());
    }

    @Override
    public void printMachinesCurrencyNotEqualError() {
        System.err.println(messages.getMachinesCurrencyNotEqual());
    }
}
