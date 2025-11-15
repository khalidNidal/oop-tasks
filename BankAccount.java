// Main.java

class BankAccount {

    private double balance;

    public BankAccount(double b) {
        this.balance = b > 0 ? b : 0;
    }

    public double getBalance() {
        return balance;
    }


    public boolean withdraw(double amount) {
        if (amount <= 0) {
            return false;
        }
        if (amount > balance) {
            // prevent overdrawing
            System.out.println("Withdrawal denied: insufficient funds.");
            return false;
        }
        balance -= amount;
        return true;
    }
}

