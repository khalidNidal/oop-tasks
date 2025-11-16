package payments;

public class CashPayment implements Payment {

    private double cash;

    public CashPayment(double c) {
        this.cash = c;
    }

    @Override
    public boolean pay(double amount) {
        if (amount <= 0 || amount > cash) {
            return false;
        }
        cash -= amount;
        return true;
    }

    @Override
    public String toString() {
        return "CashPayment{" +
                "cash=" + cash +
                '}';
    }
}
