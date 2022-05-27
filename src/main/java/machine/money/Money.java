package machine.money;

public class Money {

    private int money;

    private Money(int money) {
        validate(money);
        this.money = money;
    }

    private void validate(int money) {
        if (money < 0) {
            throw new IllegalArgumentException("돈이 음수 일 수 없습니다.");
        }
    }

    public static Money from(int money) {
        return new Money(money);
    }

    public void addMoney(BillKind bill) {
        money += bill.getMoney();
    }

    public int getMoney() {
        return money;
    }
}
