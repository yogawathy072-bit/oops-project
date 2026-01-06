class Payment {
    void pay(double amount) {
        System.out.println("Generic payment of " + amount);
    }
}

class CreditCardPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}

class UPIPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

public class Main {
    public static void main(String[] args) {
        Payment p;

        p = new CreditCardPayment();
        p.pay(500);

        p = new UPIPayment();
        p.pay(300);
    }
}