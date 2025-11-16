package payments;

public class BankAccount {
    private double balance;
    public BankAccount(double i) {
        this.balance = i > 0 ? i : 0;
    }
    public double getBalance() {
        return balance;
    }
    public boolean withdraw(double amount) {
        if (amount <= 0) {
            return false;
        }
        if (amount > balance) {
            System.out.println("withdrawal denied ,insufficient funds.");
            return false;
        }
        balance -= amount;
        return true;
    }
    @Override
    public String toString() {
        return "BankAccount{" +
                "b=" + balance +
                '}';
    }
}
