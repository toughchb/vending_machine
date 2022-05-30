package machine.money;

import java.util.Objects;

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

    public Money addBill(Bill bill) {
        money += bill.getMoney();
        return Money.from(money);
    }

    public int getMoney() {
        return money;
    }

    public Money subBill(Bill bill) {
        money -= bill.getMoney();
        return Money.from(money);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Money money1 = (Money) o;
        return money == money1.money;
    }

    @Override
    public int hashCode() {
        return Objects.hash(money);
    }
}
