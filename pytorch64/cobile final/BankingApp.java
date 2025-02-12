import java.util.Scanner;

class Bank {
    String bankName = "Central Bank";
}

class Branch extends Bank {
    String branchName;

    Branch(String branchName) {
        this.branchName = branchName;
    }
}

class Account extends Branch {
    int accountNumber;
    double balance;

    Account(String branchName, int accountNumber, double balance) {
        super(branchName);
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ". New balance: " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ". Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}

public class BankingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter branch name:");
        String branchName = scanner.nextLine();
        System.out.println("Enter account number:");
        int accountNumber = scanner.nextInt();
        System.out.println("Enter initial balance:");
        double balance = scanner.nextDouble();

        Account account = new Account(branchName, accountNumber, balance);

        while (true) {
            System.out.println("Choose: 1. Deposit 2. Withdraw 3. Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    account.deposit(scanner.nextDouble());
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    account.withdraw(scanner.nextDouble());
                    break;
                case 3:
                    System.out.println("Thank you for banking with " + account.bankName + ", " + account.branchName + " branch.");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
