package Day1;
class account{
    String name;
    double balance;
    void deposit(double amount){
        balance += amount;
    }
    void withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }
    void showBalance(){
        System.out.println("Account Holder: " + name);
        System.out.println("Current Balance: " + balance);
    }
}
public class BankAccount {
    public static void main(String[] args){
        account acc1 = new account();
        acc1.name = "John Doe";
        acc1.deposit(500.0);
        acc1.withdraw(200.0);
        acc1.showBalance();

        account acc2 = new account();
        acc2.name = "Jane Smith";
        acc2.deposit(1000.0);
        acc2.withdraw(1500.0);
        acc2.showBalance();
    }
}
