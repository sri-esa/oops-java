package practice;

abstract class Employee{
    String name;
    Employee(String name){
        this.name=name;
    }
    abstract double calculateSalary();
    void displayName(){
        System.out.println("Employee Name: " + name);
    }
}
class FullTimeEmployees extends Employee{
    double monthlySalary;
    FullTimeEmployees(String name, double monthlySalary){
        super(name);
        this.monthlySalary = monthlySalary;
    }
    double calculateSalary(){
        return monthlySalary;
    }
}
class PartTimeEmployees extends Employee{
    double hourlyRate;
    int hoursWorked;
    PartTimeEmployees(String name, double hourlyRate, int hoursWorked){
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    double calculateSalary(){
        return hourlyRate * hoursWorked;
    }
}
public class main2 {
    public static void main(String[] args) {
        FullTimeEmployees emp1 = new FullTimeEmployees("Alice", 5000);
        PartTimeEmployees emp2 = new PartTimeEmployees("Bob", 20, 80);

        emp1.displayName();
        System.out.println("Full-Time Salary: " + emp1.calculateSalary());

        emp2.displayName();
        System.out.println("Part-Time Salary: " + emp2.calculateSalary());
    }
}
