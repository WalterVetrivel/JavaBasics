package controlStatements;

public class LogicalOperators {
    public static void main(String[] args) {
        System.out.println("Unlike arithmetic operators which produce a numeric value (int, double, float), " +
                "logical operators produce boolean results (true or false)");
        System.out.println("Hence, logical operators are very useful to compare different values.");
        System.out.println("Logical operators include >, <, >=, <=, ==, !=");
        System.out.println();

        System.out.println("Is 5 greater than 3? " + (5 > 3));
        System.out.println("Is 2 greater than 4? " + (2 > 4));
        System.out.println();

        System.out.println("Is 4 less than 7? " + (4 < 7));
        System.out.println("Is 10 less than 6? " + (10 < 6));
        System.out.println();

        System.out.println("Is 12 greater than or equal to 9? " + (12 >= 9));
        System.out.println("Is 12 greater than or equal to 14? " + (12 >= 14));
        System.out.println();

        System.out.println("Is 5 less than or equal to 9? " + (5 <= 9));
        System.out.println("Is 15 less than or equal to 9? " + (15 <= 9));
        System.out.println();

        System.out.println("Is 3 equal to 3? " + (3 == 3));
        System.out.println("Is 4 equal to 6? " + (4 == 6));
        System.out.println();

        System.out.println("Is 5 not equal to 7? " + (5 != 7));
        System.out.println("Is 7 not equal to 7? " + (7 != 7));
    }
}
