class Student {
    public String name;
    private int marks;
    protected String grade;
    int rollNumber;

    public void setMarks(int m) {
        if (m >= 0 && m <= 100)
            marks = m;
    }

    private void calculateGrade() {
        grade = (marks >= 40) ? "Pass" : "Fail";
    }

    public String getGrade() {
        calculateGrade();
        return grade;
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Anu";
        s.setMarks(85);
        System.out.println("Grade: " + s.getGrade());
    }
}