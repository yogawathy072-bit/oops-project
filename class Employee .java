class Employee {
    static String companyName = "ABC Ltd";
    static int employeeCount = 0;

    int employeeId;
    String employeeName;

    Employee(String name) {
        employeeName = name;
        employeeCount++;
        employeeId = employeeCount;
    }

    static int getEmployeeCount() {
        return employeeCount;
    }

    void displayEmployee() {
        System.out.println(employeeId + " " + employeeName + " " + companyName);
    }
}

public class StaticKeyword {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ram");
        Employee e2 = new Employee("Sam");

        e1.displayEmployee();
        e2.displayEmployee();
        System.out.println("Total Employees: " + Employee.getEmployeeCount());
    }
}