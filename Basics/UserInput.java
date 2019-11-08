package Basics;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        System.out.println("Most software requires user input.");
        System.out.println("We need a way of getting input from the users.");
        System.out.println("One basic way is using a Scanner.");
        System.out.println("Scanner must be imported before we can use it.");
        System.out.println("We import Scanner using import java.util.Scanner.");
        System.out.println("We must then create a scanner variable.");

        Scanner scanner = new Scanner(System.in);

        System.out.println("We can use the created scanner variable (instance) to read user input.");
        System.out.println("To read a string, we use scanner.nextLine()");
        System.out.println();
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Welcome, " + name);
        System.out.println("scanner.nextLine() reads the user input until the user presses enter.");
        System.out.println("To read a single word (terminated by space), we can use scanner.next()");
        System.out.print("Enter your city: ");
        String city = scanner.next();
        System.out.println("Your city is " + city);
        System.out.println();

        System.out.println("To read an int, we use scanner.nextInt()");
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("You are " + age + " years old.");
        System.out.println();

        System.out.println("To read a double, we use scanner.nextDouble()");
        System.out.println("Enter your GPA: ");
        double gpa = scanner.nextDouble();
        System.out.println("Your GPA is: " + gpa);
        System.out.println();
    }
}
