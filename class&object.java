1. Class & Object – Student Management System
class Student {
    String name;
    int rollNumber;
    int marks;

    void setDetails(String n, int r, int m) {
        name = n;
        rollNumber = r;
        marks = m;
    }

    void displayDetails() {
        System.out.println(name + " " + rollNumber + " " + marks);
    }

    boolean isPassed() {
        return marks >= 40;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setDetails("Kishore", 101, 75);
        s1.displayDetails();
        System.out.println(s1.isPassed());
    }
}