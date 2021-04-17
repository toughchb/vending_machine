package machine.display;
public class DDisplay extends Display{

    /* Map<Insert, String> coinKind ==should declare a Map that is from coin inserter */
    @Override
    public void printMainMenu() {
        System.out.println(super.messages.getMainMenu());
    }

    @Override
    public void printInsertMoneyMenu() {
        System.out.println(super.messages.getInsertMoneyMenu());
        System.out.println();/* print 'coinKind' */
    }

    @Override
    public void printReturnChange() {

    }

    @Override
    public void printSelectProductMenu() {

    }
}
