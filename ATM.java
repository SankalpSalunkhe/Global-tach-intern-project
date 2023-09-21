// Import required classes and packages
import java.util.Scanner;

// Create the ATMInterface class to implement the ATM functionality
public class ATM {
    // Main method starts
    public static void main(String args[]) {
        // Declare and initialize variables
        int balance = 100000;
        int withdraw, deposit, transfer;
        int pin = 1234; // Default PIN

        // Create a scanner class object to get the user's choice
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your PIN: ");
        int enteredPin = sc.nextInt();

        if (enteredPin != pin) {
            System.out.println("Invalid PIN. Access denied.");
            System.exit(0);
        }

        while (true) {
            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Transfer");
            System.out.println("Choose 4 for Check Balance");
            System.out.println("Choose 5 for EXIT");
            System.out.print("Choose the operation you want to perform: ");

            // Get the user's choice
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount to be withdrawn: ");
                    // Get the withdrawal amount from the user
                    withdraw = sc.nextInt();

                    // Check whether the balance is greater than or equal to the withdrawal amount
                    if (balance >= withdraw) {
                        // Remove the withdrawal amount from the total balance
                        balance = balance - withdraw;
                        System.out.println("Please collect your money");
                    } else {
                        // Show a custom error message
                        System.out.println("Insufficient Balance");
                    }
                    System.out.println("");
                    break;

                case 2:
                    System.out.print("Enter the amount to be deposited: ");
                    // Get the deposit amount from the user
                    deposit = sc.nextInt();

                    // Add the deposit amount to the total balance
                    balance = balance + deposit;
                    System.out.println("Your money has been successfully deposited");
                    System.out.println("");
                    break;

                case 3:
                    System.out.print("Enter the amount to be transferred: ");
                    // Get the transfer amount from the user
                    transfer = sc.nextInt();

                    // Check whether the balance is greater than or equal to the transfer amount
                    if (balance >= transfer) {
                        // Remove the transfer amount from the total balance
                        balance = balance - transfer;
                        System.out.println("Transfer successful");
                    } else {
                        // Show a custom error message
                        System.out.println("Insufficient Balance");
                    }
                    System.out.println("");
                    break;

                case 4:
                    // Display the total balance of the user
                    System.out.println("Balance: " + balance);
                    System.out.println("");
                    break;

                case 5:
                    // Exit from the menu
                    System.exit(0);
            }
        }
    }
}
