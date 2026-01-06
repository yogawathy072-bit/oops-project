abstract class Shape {
    abstract void calculateArea();

    void displayShape() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    int radius = 5;

    void calculateArea() {
        System.out.println("Area of Circle: " + (3.14 * radius * radius));
    }
}

class Rectangle extends Shape {
    int length = 4, breadth = 6;

    void calculateArea() {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }
}

public class Main {
    public static void main(String[] args) {
        Shape s;

        s = new Circle();
        s.calculateArea();

        s = new Rectangle();
        s.calculateArea();
    }
}