
interface Payment {

    boolean pay(double amount);

}

class CreditCardPayment implements Payment {

    private String cardNumber;
    private double currentDebt;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
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
    
}

class CashPayment implements Payment {

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

}
