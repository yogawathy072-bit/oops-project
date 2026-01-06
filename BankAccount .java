class BankAccount {
    private int accountNumber;
    private double balance;

    BankAccount(int acc, double bal) {
        accountNumber = acc;
        balance = bal;
    }

    void deposit(double amount) {
        if (amount > 0)
            balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
    }

    double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount b = new BankAccount(1234, 5000);
        b.deposit(1000);
        b.withdraw(2000);
        System.out.println(b.getBalance());
    }
}