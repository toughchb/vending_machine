package machine.money;

import static org.assertj.core.api.Assertions.assertThat;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MoneyTest {

    @Test
    @DisplayName("생성 예외 테스트")
    void moneyTest1() {
        Assertions.assertThatThrownBy(
                () -> Money.from(-1)
        ).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("enum 덧셈 테스트")
    void moneyTest2() {
        Money money = Money.from(0);
        money.addMoney(BillKind.KRW_1000);
        assertThat(money.getMoney()).isEqualTo(1000);
    }
}
