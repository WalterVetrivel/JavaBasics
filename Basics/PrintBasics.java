package Basics;

public class PrintBasics {
    public static void main(String[] args) {
        System.out.println("System.out.println() prints a string on the screen and adds a new line at the end.");
        System.out.print("System.out.print() does not add a new line at the end.");
        System.out.println("Therefore, this will be on the same line as the previous sentence.");
        System.out.println("But this will be on a new line because the previous line was printed using System.out.println()");

        System.out.println("We can use the Java print methods to print numbers as well.");
        System.out.println("For numbers, we don't wrap them around double quotes.");
        System.out.println(2);
        System.out.println(7);
        System.out.println(500);

        System.out.println("We can even use expressions inside the print methods.");
        System.out.println(4 + 3);
        System.out.println(2 - 1);
        System.out.println(3 * 2);
        System.out.println(4 / 2);

        System.out.println("System.out.println() without any value passed in will simply print a blank line.");
        System.out.println();
        System.out.println("This is useful to create space between two lines and in other use cases.");
        System.out.println();

        System.out.println("We can combine or concatenate multiple strings using +: ");
        System.out.println("Jesus " + "Christ");
        System.out.println("We can even combine strings with numbers and " +
                "Java will automatically convert the numbers to strings");
        System.out.println("My age is " + 25);
        System.out.println("We can combine more than 2 strings or numbers");
        System.out.println("I am " + 25 + " years old.");
        System.out.println("And as we saw above in the code, " +
                "we can use this syntax to split long strings across multiple lines in the code, like this.");
        System.out.println();

        System.out.println("When we are concatenating strings with numbers, we need to watch out for the following: ");
        System.out.println("4 + 5 = " + 4 + 5); // Prints 4 + 5 = 45, not 9 as you'd expect
        System.out.println("This is because Java converts each of the numbers into strings and concatenates them.");
        System.out.println("Use () around the expression to overcome this.");
        // This following will print 4 + 5 = 9 as
        // (4 + 5) is evaluated as a numeric expression and then converted to a string
        System.out.println("4 + 5 = " + (4 + 5));
    }
}
