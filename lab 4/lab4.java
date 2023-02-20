
import java.util.ArrayList;
import java.util.Scanner;

public class lab4 {
    private static int accountNumber;
    private static String accountHolderName;
    private static double accountBalance;
    private static ArrayList<String> transactions = new ArrayList<>();

    public static void initializeCustomer(int accNo, String accName, double accBal) {
        accountNumber = accNo;
        accountHolderName = accName;
        accountBalance = accBal;
        transactions.add("Initial balance: " + accountBalance);
    }

    public static void depositMoney(double amount) {
        accountBalance += amount;
        transactions.add("Deposit: " + amount);
    }

    public static void withdrawMoney(double amount) {
        if (amount <= accountBalance) {
            accountBalance -= amount;
            transactions.add("Withdrawal: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public static void printTransactions() {
        System.out.println("Transaction history:");
        for (String transaction : transactions) {
            System.out.println(transaction);
        }
    }

    public static void printAccountSummary() {
        System.out.println("Account summary:");
        System.out.println("Account number: " + accountNumber);
        System.out.println("Account holder name: " + accountHolderName);
        System.out.println("Account balance: " + accountBalance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        System.out.println("Welcome to Bank Account Management System.");
        System.out.println("Please initialize customer details.");
        System.out.print("Enter account number: ");
        int accNo = scanner.nextInt();
        System.out.print("Enter account holder name: ");
        scanner.nextLine();
        String accName = scanner.nextLine();
        System.out.print("Enter account balance: ");
        double accBal = scanner.nextDouble();
        initializeCustomer(accNo, accName, accBal);
        while (!exit) {
            System.out.println("\nPlease select an option:");
            System.out.println("1. Deposit money");
            System.out.println("2. Withdraw money");
            System.out.println("3. Print transactions");
            System.out.println("4. Print account summary");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    depositMoney(depositAmount);
                    System.out.println("Deposit successful.");
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    withdrawMoney(withdrawalAmount);
                    break;
                case 3:
                    printTransactions();
                    break;
                case 4:
                    printAccountSummary();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
        scanner.close();
        System.out.println("Thank you for using Bank Account Management System.");
    }
}