package basics.exercises.calculate;
import java.util.Scanner;

public class MarksCalculatorSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float assignment1Weight = 0.1f;
        float assignment2Weight = 0.1f;
        float midSemesterWeight = 0.25f;
        float finalExamWeight = 0.55f;

        int assignment1Max = 15;
        int assignment2Max = 15;
        int midSemesterMax = 25;
        int finalExamMax = 60;

        System.out.print("Enter assignment 1 mark (0-15): ");
        double assignment1Mark = scanner.nextDouble();
        System.out.print("Enter assignment 2 mark (0-15): ");
        double assignment2Mark = scanner.nextDouble();
        System.out.print("Enter mid semester mark (0-25): ");
        double midSemesterMark = scanner.nextDouble();
        System.out.print("Enter final exam mark (0-60): ");
        double finalExamMark = scanner.nextDouble();

        double assignment1Weighted = (assignment1Mark / assignment1Max) * assignment1Weight;
        double assignment2Weighted = (assignment2Mark / assignment2Max) * assignment2Weight;
        double midSemesterWeighted = (midSemesterMark / midSemesterMax) * midSemesterWeight;
        double finalExamWeighted = (finalExamMark / finalExamMax) * finalExamWeight;

        double totalMark = (assignment1Weighted + assignment2Weighted + midSemesterWeighted + finalExamWeighted) * 100;
        System.out.println("The total mark for the unit is: " + totalMark);
    }
}
