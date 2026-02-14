package Day2;

public class Employee {
    int empId;
    String name;
    float basicPay;
    Employee(int id, String n, float pay) {
        this.empId = id;
        this.name = n;
        this.basicPay = pay;
    }
    double gross(){
        return basicPay+0.2*basicPay+0.1*basicPay;
    }
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Arisu", 50000);
        System.out.println("Gross Salary of " + e1.name + ": " + e1.gross());
    }
}
