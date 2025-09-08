public class CurrentAccount extends Account {
    private double servicechargeRate = 0.035; // 3.5%

    public CurrentAccount(String acc_name, int accno, double balance) {
        super(acc_name, accno, balance);
    }

    @Override
    public void withdraw() {
        System.out.println("Enter the amount to be withdrawn:");
        double amount = s.nextDouble();

        if (amount > balance) {
            double overdrawn = amount - balance;
            double servicecharge = overdrawn * servicechargeRate;

            balance = balance - amount - servicecharge; // goes negative
            System.out.println("Overdrawn! Service charge of " + servicecharge + " applied.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful!");
        }
        viewbalance();
    }

    @Override
    public void deposit() {
        System.out.println("Enter the amount to be deposited:");
        double amount = s.nextDouble();

        balance += amount;
        System.out.println("Deposit successful (No interest applied).");
        viewbalance();
    }
}
