import java.util.Scanner;

/**
 * This program simulates an ATM system for managing transactions in Kenyan Shillings (KES).
 * Functionalities include checking balance, withdrawing cash, transferring money, and depositing money.
 */
public class ATMTransactionManager {
    private static final double TRANSFER_CHARGE_RATE = 0.001; // 0.1% transfer charge for external transfers
    private static double balance = 0; // User's balance

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            displayMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    withdrawCash(scanner);
                    break;
                case 3:
                    transferMoney(scanner);
                    break;
                case 4:
                    depositMoney(scanner);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 5);

        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("\nATM Transaction Manager");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Cash");
        System.out.println("3. Transfer Money");
        System.out.println("4. Deposit Money");
        System.out.println("5. Exit");
    }

    private static void checkBalance() {
        System.out.println("Current balance: KES " + balance);
    }

    private static void withdrawCash(Scanner scanner) {
        System.out.print("Enter the amount to withdraw: KES ");
        double amount = scanner.nextDouble();
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: KES " + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    private static void transferMoney(Scanner scanner) {
        System.out.print("Enter the amount to transfer: KES ");
        double amount = scanner.nextDouble();
        if (amount <= balance) {
            System.out.print("Enter the recipient's account type (1 for same bank, 2 for other bank): ");
            int accountType = scanner.nextInt();
            if (accountType == 1) {
                balance -= amount;
                System.out.println("Transfer successful. New balance: KES " + balance);
            } else if (accountType == 2) {
                double charge = amount * TRANSFER_CHARGE_RATE;
                if (amount + charge <= balance) {
                    balance -= (amount + charge);
                    System.out.println("Transfer successful. Transfer charge: KES " + charge + ", New balance: KES " + balance);
                } else {
                    System.out.println("Insufficient funds for transfer and charge.");
                }
            } else {
                System.out.println("Invalid account type.");
            }
        } else {
            System.out.println("Insufficient funds for transfer.");
        }
    }

    private static void depositMoney(Scanner scanner) {
        System.out.print("Enter the amount to deposit: KES ");
        double amount = scanner.nextDouble();
        balance += amount;
        System.out.println("Deposit successful. New balance: KES " + balance);
    }
}