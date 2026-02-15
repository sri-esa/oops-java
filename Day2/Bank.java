package Day2;

public class Bank {
    int accNo;
    String holderName;
    double balance;
    Bank(int accNo, String holderName, double balance) {
        this.accNo = accNo;
        this.holderName = holderName;
        this.balance = balance;
    }
    void deposit(double amt){
        balance+=amt;
    }
    void withdraw(double amt){
        if(amt>balance){
            System.out.println("Insufficient balance");
        } else {
            balance-=amt;
        }
    }
    public static void main(String[] args){
        Bank u1=new Bank(98765, "Ria Das", 50000);
        u1.deposit(10000);
        u1.withdraw(70000);
        System.out.println("User: " + u1.holderName);
        System.out.println("Balance: " + u1.balance);
    }
}
