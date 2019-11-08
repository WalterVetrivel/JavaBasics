package basics.exercises.userInput;
import java.util.Scanner;

public class UserInputSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ID = 456;
        String firstName;
        String lastName;
        long accountNumber = 1234567890L;
        char accountType = 'A';
        boolean isActive = true;
        double balance;

        System.out.println("Enter your first name: ");
        firstName = scanner.nextLine();
        System.out.println("Enter your last name: ");
        lastName = scanner.nextLine();
        System.out.println("Enter your balance: ");
        balance = scanner.nextDouble();

        System.out.println("ID: " + ID);
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Is account active? " + isActive);
        System.out.println("Account Balance: $" + balance);
    }
}
