package payments;

public class CreditCardPayment implements Payment {

    private String cardNumber;
    private double currentDebt;

    public CreditCardPayment(String cno) {
        this.cardNumber = cno;
        this.currentDebt = 0;
    }

    @Override
    public boolean pay(double amount) {
        if (amount <= 0) {
            return false;
        }
        currentDebt += amount;
        return true;
    }

    @Override
    public String toString() {
        return "CreditCardPayment{" +
                "cardNumber='" + cardNumber + '\'' +
                ", currentDebt=" + currentDebt +
                '}';
    }
}
