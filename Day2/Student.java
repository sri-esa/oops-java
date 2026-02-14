package Day2;
class Student {
    String name;
    int roll;
    String dept;

    // Parameterized Constructor
    Student(String n, int r, String d) {
        this.name = n;
        this.roll = r;
        this.dept = d;
    }

    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Department: " + dept);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Rahul", 101, "CSE");
        s1.printDetails();
    }
}
