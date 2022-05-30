package machine.money;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MoneyTest {

    @Test
    @DisplayName("생성 예외 테스트")
    void moneyTest1() {
        assertThatThrownBy(
                () -> Money.from(-1)
        ).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("enum 덧셈 테스트")
    void moneyTest2() {
        Money money = Money.from(0);
        Money addedMoney = money.addBill(BillKind.KRW_1000);
        assertThat(addedMoney).isEqualTo(Money.from(1000));
    }

    @Test
    @DisplayName("enum 뺄셈 테스트")
    void moneyTest3() {
        Money money = Money.from(2000);
        Money subbedMoney = money.subBill(BillKind.KRW_1000);
        assertThat(subbedMoney).isEqualTo(Money.from(1000));
    }

    @Test
    @DisplayName("enum 뺄셈 후 음수라면 예외")
    void moneyTest4() {
        Money money = Money.from(500);
        assertThatThrownBy(
                () -> money.subBill(BillKind.KRW_1000)
        ).isInstanceOf(IllegalArgumentException.class);
    }
}
