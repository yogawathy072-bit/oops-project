interface SmartDevice {
    void turnOn();
    void turnOff();
}

class SmartLight implements SmartDevice {
    public void turnOn() {
        System.out.println("Light ON");
    }
    public void turnOff() {
        System.out.println("Light OFF");
    }
}

class SmartFan implements SmartDevice {
    public void turnOn() {
        System.out.println("Fan ON");
    }
    public void turnOff() {
        System.out.println("Fan OFF");
    }
}

public class Main {
    public static void main(String[] args) {
        SmartDevice d1 = new SmartLight();
        d1.turnOn();

        SmartDevice d2 = new SmartFan();
        d2.turnOff();
    }
}