import java.util.Scanner;
public class Account {
    protected String acc_name;
    protected int accno;
    protected double balance;
    Scanner s = new Scanner(System.in);

    public Account(String acc_name, int accno, double balance) {
        this.acc_name = acc_name;
        this.accno = accno;
        this.balance = balance;
    }

    public void viewbalance() {
        System.out.println("Balance: " + balance);
    }

    public void withdraw() {
        System.out.println("Enter the amount to be withdrawn:");
        double amount = s.nextDouble();
        if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
            System.out.println("The amount has been successfully withdrawn");
            viewbalance();
        }
    }

    public void deposit() {
        System.out.println("Enter the amount to be deposited:");
        double amount = s.nextDouble();
        balance += amount;
        System.out.println("The amount has been successfully deposited");
        viewbalance();
    }
}
