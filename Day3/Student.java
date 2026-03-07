package Day3;

public class Student {
    private int roll;
    private String name;
    private int marks;

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public void setMarks(int marks) {
        this.marks = (marks >= 0 && marks <= 100) ? marks : 0;
    }

    public int getMarks() {
        return marks;
    }
    public static void main(String[] args) {
        Student student = new Student(1, "Alice");
        student.setMarks(85);
        System.out.println("Student: " + student.name + ", Roll: " + student.roll + ", Marks: " + student.getMarks());
    }
}

