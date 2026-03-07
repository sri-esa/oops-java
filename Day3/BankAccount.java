package Day3;

public class BankAccount {
    private String accNo;
    private String name;
    private double balance;

    public BankAccount(String accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Balance after deposit: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful. Balance: " + balance);
        } else {
            System.out.println("Withdrawal failed. Insufficient balance.");
        }
    }

    public double getBalance() {
        return balance;
    }
    public static void main(String[] args) {
        BankAccount account = new BankAccount("12345", "John Doe", 1000.0);
        System.out.println("Initial Balance: " + account.getBalance());
        account.deposit(500);
        account.withdraw(200);
        account.withdraw(1500);
    }
}