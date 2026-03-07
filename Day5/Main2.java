package Day5;

interface Payment{
    void pay(double amount);
}
interface Refund{
    void refund(double amount);
}
class UPI implements Payment,Refund{
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
    public void refund(double amount) {
        System.out.println("Refunded " + amount + " using UPI");
    }
}
public class Main2 {
    public static void main(String[] args) {
        UPI upi = new UPI();
        upi.pay(500.0);
        upi.refund(250.0);
    }
}
