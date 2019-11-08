package basics.exercises.account;

public class AccountSolution {
    public static void main(String[] args) {
        int ID;
        String firstName;
        String lastName;
        long accountNumber;
        char accountType;
        boolean isActive;
        double balance;

        ID = 456;
        firstName = "John";
        lastName = "Doe";
        accountNumber = 1234567890L;
        accountType = 'A';
        isActive = true;
        balance = 4000;

        System.out.println("ID: " + ID);
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Is account active? " + isActive);
        System.out.println("Account Balance: $" + balance);
    }
}
