package controlStatements;

public class UnaryAndAssignmentOperators {
    public static void main(String[] args) {
//        Increment operator
        int counter = 0;
        System.out.println("Initial: " + counter);
        System.out.println("Post-increment: " + counter++);
        System.out.println("After post-increment: " + counter);
        System.out.println("Pre-increment:" + ++counter);
        System.out.println("After pre-increment: " + counter);
        System.out.println();

//        Decrement operator
        int counter2 = 10;
        System.out.println("Initial: " + counter2);
        System.out.println("Post-decrement: " + counter2--);
        System.out.println("After post-decrement: " + counter2);
        System.out.println("Pre-decrement: " + --counter2);
        System.out.println("After pre-decrement: " + counter2);
        System.out.println();

//        Add and assign operator
        int value = 5;
        System.out.println("Initial: " + value);
        value += 2;
        System.out.println("After adding 2: " + value);
        value -= 3;
        System.out.println("After subtracting 3: " + value);
        value *= 4;
        System.out.println("After multiplying by 4: " + value);
        value /= 8;
        System.out.println("After dividing by 8: " + value);
    }
}
