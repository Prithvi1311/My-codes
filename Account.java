public class Account {
    private double balance;

    public Account() {
        balance = 0.0;
    }

    public Account(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid or insufficient balance for withdrawal.");
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }


    public static void main(String[] args) {
        Account myAccount = new Account(500.0);
        myAccount.deposit(200.0);
        myAccount.withdraw(100.0);
        myAccount.displayBalance();
    }
}
