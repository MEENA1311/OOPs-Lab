import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Account a = null;
        Scanner s = new Scanner(System.in);

        System.out.println("Choose the account type:");
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");

        int ch = s.nextInt();
        s.nextLine();

        System.out.print("Enter Customer Name: ");
        String name = s.nextLine();
        System.out.print("Enter Account Number: ");
        int acno = s.nextInt();
        System.out.print("Enter Initial Balance: ");
        double balance = s.nextDouble();

        if (ch == 1) {
            a = new SavingsAccount(name, acno, balance);
        } else if (ch == 2) {
            a = new CurrentAccount(name, acno, balance);
        } else {
            System.out.println("Invalid choice!");
            System.exit(0);
        }

        int op;
        do {
            System.out.println("\n_____ Account Menu _____");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            op = s.nextInt();

            switch (op) {
                case 1:
                    a.viewbalance();
                    break;
                case 2:
                    a.deposit();
                    break;
                case 3:
                    a.withdraw();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        } while (op != 4);

        s.close();
    }
}




