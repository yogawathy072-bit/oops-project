class Vehicle {
    String brand;
    int speed;

    void start() {
        System.out.println("Vehicle started");
    }

    void stop() {
        System.out.println("Vehicle stopped");
    }
}

class Car extends Vehicle {
    void openTrunk() {
        System.out.println("Trunk opened");
    }
}

class Bike extends Vehicle {
    void kickStart() {
        System.out.println("Bike kick started");
    }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.openTrunk();

        Bike b = new Bike();
        b.kickStart();
    }
}