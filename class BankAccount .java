class BankAccount {
    int accountNumber;
    double balance;

    BankAccount() {
        accountNumber = 0;
        balance = 0;
    }

    BankAccount(int accNo, double initialBalance) {
        accountNumber = accNo;
        balance = initialBalance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
    }

    void displayAccount() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

public class ConstructorExample {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(101, 500);
        acc.deposit(200);
        acc.displayAccount();
    }
}