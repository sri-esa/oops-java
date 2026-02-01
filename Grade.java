class Student {
    String name;
    float marks;
    void printGrade() {
        if (marks >= 90) {
            System.out.println(name + " has received an O grade.");
        } else if (marks >= 80) {
            System.out.println(name + " has received a E grade.");
        } else if (marks >= 70) {
            System.out.println(name + " has received a A grade.");
        } else if (marks >= 60) {
            System.out.println(name + " has received a B grade.");
        } else if (marks >= 50) {
            System.out.println(name + " has received an C grade.");
        } else {
            System.out.println(name + " has received a F grade.");
        }
    }
}
public class Grade {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Ravi";
        student1.marks = 95.0f;
        student1.printGrade();

        Student student2 = new Student();
        student2.name = "Sita";
        student2.marks = 45.5f;
        student2.printGrade();
    }
}
