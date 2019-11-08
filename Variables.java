public class Variables {
    public static void main(String[] args) {
        System.out.println("In Java, we would have to use the same data in multiple places in the code.");
        System.out.println("Imagine we want to display the username in three different places on the app.");
        System.out.println("Or we have to multiply the different people's " +
                "income with a particular value (say 0.2) to calculate bonus.");
        System.out.println();

        System.out.println("We can do the following (without variables): ");
        System.out.println("Hello, Liz");
        System.out.println("Hello, Liz");
        System.out.println("Hello, Liz");
        System.out.println();

        System.out.println(3000 * 0.2);
        System.out.println(5000 * 0.2);
        System.out.println(4000 * 0.2);
        System.out.println();

        System.out.println("Now, imagine we need to change the username. Or the percentage value.");
        System.out.println("We would have to find each occurrence of the value in the code and change it.");
        System.out.println("Also, what if we make a typo in one of the instances?");
        System.out.println("There is a better way, using variables.");
        System.out.println();

        System.out.println("Let's create a variable to store the username.");

        String username = "Liz";

        System.out.println("Now we can use the variable how many ever times we want");
        System.out.println(username); // Will print Liz
        System.out.println(username);
        System.out.println(username);
        System.out.println("We can even combine it with a string while printing like this:");
        System.out.println("Hello, " + username); // Will print Hello, Liz
        System.out.println("If we have to change the name, we only need to change the value of username " +
                "and in every subsequent occurrence, the name is changed");
        System.out.println();

        username = "Simon";
        System.out.println("Hello, " + username); // Will print Hello, Simon
        System.out.println();

        System.out.println("Let's create a new variable for the bonus percentage.");

        double bonusPercent = 0.2;

        System.out.println(3000 * bonusPercent);
        System.out.println(5000 * bonusPercent);
        System.out.println(4000 * bonusPercent);
        System.out.println();

        System.out.println("If we need to change the percentage, we only need to change the value of bonusPercent");
        bonusPercent = 0.25;
        System.out.println(3000 * bonusPercent);
        System.out.println(5000 * bonusPercent);
        System.out.println(4000 * bonusPercent);
    }
}
