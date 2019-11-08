package basics.exercises.calculate;
import java.util.Scanner;

public class SimpleInterestCalculatorSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the principal (P): ");
        double principal = scanner.nextDouble();
        System.out.print("Please enter the number of years (n): ");
        int numberOfYears = scanner.nextInt();
        System.out.print("Please enter the rate of interest (r): ");
        double rate = scanner.nextDouble();

        double simpleInterest = (principal * numberOfYears * rate) / 100;

        System.out.println("Simple Interest: " + simpleInterest);
    }
}
