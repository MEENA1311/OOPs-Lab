public class SavingsAccount extends Account {
    private double interestrate = 0.06; // 6%

    public SavingsAccount(String acc_name, int accno, double balance) {
        super(acc_name, accno, balance);
    }

    @Override
    public void withdraw() {
        System.out.println("Enter the amount to be withdrawn:");
        double amount = s.nextDouble();

        if (amount > balance) {
            System.out.println("Overdrawn not possible!");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful!");
            viewbalance();
        }
    }

    @Override
    public void deposit() {
        System.out.println("Enter the amount to be deposited:");
        double amount = s.nextDouble();

        double interest_amount = amount * interestrate;
        balance += amount + interest_amount;

        System.out.println("Deposited with 6% interest added.");
        viewbalance();
    }
}
