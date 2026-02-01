class Student{
    String name;
    int rollNumber;
    float marks;
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }
}
public class Main{
    public static void main(String[] args){
        Student s1=new Student();
        s1.name="Anita";
        s1.rollNumber=101;
        s1.marks=95.5f;
        s1.display();
    }
}