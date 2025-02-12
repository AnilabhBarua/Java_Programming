import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
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
            System.out.println("Invalid withdraw amount or insufficient balance.");
        }
    }

    public void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}

public class BankAccountTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter initial balance for Account 1:");
        BankAccount acc1 = new BankAccount(sc.nextDouble());
        System.out.println("Enter initial balance for Account 2:");
        BankAccount acc2 = new BankAccount(sc.nextDouble());

        acc1.deposit(1000);
        acc1.withdraw(500);
        acc1.displayBalance();

        acc2.deposit(2000);
        acc2.withdraw(3000); // Should show error
        acc2.displayBalance();
    }
}
