package Day3;

public class Employee {
    private int empId;
    private String name;
    private double basic;

    public Employee(int empId, String name, double basic) {
        this.empId = empId;
        this.name = name;
        this.basic = basic;
    }

    public double getGross() {
        double hra = 0.2 * basic;
        double da = 0.1 * basic;
        return basic + hra + da;
    }
    public static void main(String[] args) {
        Employee emp = new Employee(101, "Bob", 5000);
        System.out.println("Employee: " + emp.name + ", ID: " + emp.empId + ", Gross Salary: " + emp.getGross());
    }
} 
