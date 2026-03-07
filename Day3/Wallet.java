package Day3;

public class Wallet {
    private double balance;
    private int pin;

    public Wallet(double balance, int pin) {
        this.balance = balance;
        this.pin = pin;
    }

    public boolean transfer(double amt, int enteredPin) {
        if (enteredPin == pin && amt > 0 && balance >= amt) {
            balance -= amt;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }
    public static void main(String[] args) {
        Wallet wallet = new Wallet(1000, 1234);
        System.out.println("Initial Balance: " + wallet.getBalance());
        boolean success = wallet.transfer(200, 1234);
        System.out.println("Transfer successful: " + success);
        System.out.println("Balance after transfer: " + wallet.getBalance());
    }
}
