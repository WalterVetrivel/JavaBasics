package basics;

public class ArithmeticOperators {
    public static void main(String[] args) {
        System.out.println("We can use Java to add (+), subtract (-), multiply (*), divide (/) numbers.");
        System.out.println("Addition: " + (2 + 5));
        System.out.println("Subtraction: " + (5 - 2));
        System.out.println("Multiplication: " + (5 * 2));
        System.out.println("Division: " + (6 / 2));
        System.out.println();

        System.out.println("We can also use the operators on variables.");
        int num1 = 10;
        int num2 = 2;
        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));
        System.out.println();

        System.out.println("We can also use one variable and one number.");
        System.out.println("Addition: " + (num1 + 5));
        System.out.println("Subtraction: " + (num1 - 3));
        System.out.println("Multiplication: " + (num1 * 7));
        System.out.println("Division: " + (num1 / 2));
        System.out.println();

        System.out.println("We can use the operators for floats and doubles too.");
        System.out.println("If one of the operands is a double, the result will be a double and can't be stored in an int.");
        double num3 = 25; // Double can also have integer values, but int can't have double values
        double num4 = 2.5;
        System.out.println("Addition: " + (num3 + num4));
        System.out.println("Subtraction: " + (num3 - num4));
        System.out.println("Multiplication: " + (num3 * num4));
        System.out.println("Division: " + (num3 / num4));
        System.out.println();

        System.out.println("We also have a special modulo (%) operator that is used to find the remainder when dividing 2 numbers.");
        System.out.println(5 % 2);
        System.out.println(7 % 3);

        System.out.println("We can have multiple operators in a single expression.");
        System.out.println(3 + 5 + 7);
        System.out.println(5 - 2 + 1);
        System.out.println("When we have more than one operator in an expression, we need to follow certain rules.");
        System.out.println("All the basic arithmetic operators have left to right associativity.");
        System.out.println("3 + 5 + 7 => 8 + 7 => 15");
        System.out.println("5 - 2 + 1 => 3 + 1 => 4");
        System.out.println("Multiplication & division are done before addition & subtraction.");
        System.out.println("4 + 5 * 3 => 4 + 15 => 19");
        System.out.println(4 + 5 * 3);
        System.out.println("6 + 4 / 2 * 3 => 6 + 2 * 3 => 6 + 6 => 12");
        System.out.println(6 + 4 / 2 * 3);
        System.out.println("5 + 4 * 3 / 6 => 5 + 12 / 6 => 5 + 2 => 7");
        System.out.println(5 + 4 * 3 / 6);
        System.out.println("To perform addition/subtraction before multiplication/division, use brackets");
        System.out.println("(5 + 3) * 7 => 8 * 7 => 56");
        System.out.println((5 + 3) * 7);
    }
}
