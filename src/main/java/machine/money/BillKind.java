package machine.money;

public enum BillKind implements Bill{
    KRW_10000 (10000.0),
    KRW_5000 (5000.0),
    KRW_1000 (1000.0);

    private double money;

    BillKind(double money) {
        this.money = money;
    }

    @Override
    public double getMoney() {
        return money;
    }
}
