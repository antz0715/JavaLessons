import java.util.Scanner;

public class SimpleBankingSystem {
    private double balance;

    public SimpleBankingSystem() {
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Amount should be positive!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }

    public static void main(String[] args) {
        SimpleBankingSystem bank = new SimpleBankingSystem();
        Scanner scanner = new Scanner(System.in);
        int choice;
        double amount;

        do {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    amount = scanner.nextDouble();
                    bank.deposit(amount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    amount = scanner.nextDouble();
                    bank.withdraw(amount);
                    break;
                case 3:
                    bank.checkBalance();
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);
        scanner.close();
    }
    
}
