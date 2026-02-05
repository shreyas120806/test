import java.util.Scanner;

public class ATM {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int correctPIN = 1221;
        double balance = 1234567890000.0;

        System.out.print("Enter your PIN: ");
        int enteredPIN = scanner.nextInt();

        if (enteredPIN != correctPIN) {
            System.out.println("Incorrect PIN. Exiting...");
            scanner.close();
            return;
        }

        System.out.println("Login successful!");

        while (true) {
            
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your current balance is: ₹" + balance);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ₹");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount > balance) {
                        System.out.println("Insufficient balance!");
                    } else {
                        balance -= withdrawAmount;
                        System.out.println("Withdrawal successful. New balance: ₹" + balance);
                    }
                    break;

                case 3:
                    System.out.print("Enter amount to deposit: ₹");
                    double depositAmount = scanner.nextDouble();
                    balance += depositAmount;
                    System.out.println("Deposit successful. New balance: ₹" + balance);
                    break;

                case 4:
                    System.out.println("Exiting... Thank you for using the ATM.");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }

            if (choice == 4) {
                break;
            }
        }
            
        scanner.close();
    }
}

    

