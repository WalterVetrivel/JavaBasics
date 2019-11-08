package Basics;

public class DataTypes {
    public static void main(String[] args) {
//        Datatypes
        System.out.println("Data type refers to the type of data a variable can hold.");
        System.out.println("The syntax for declaring a variable is: ");
        System.out.println("<datatype> <variable_name>;");
        System.out.println();

//        Integer
        System.out.println("For integer numbers, we use int. It can store values from –2,147,483,648 to 2,147,483,647.");
        int age;
        System.out.println("We can assign values to variables using = ");
        age = 25;
        System.out.println("Age: " + age);
        System.out.println("We can assign values to variables while declaring them.");
        int marks = 80;
        System.out.println("Marks: " + marks);
        System.out.println();

//        Reassigment
        System.out.println("We can change values of variables after assigning them.");
        age = 26;
        marks = 85;
        System.out.println("But to an int variable, we cannot assign other types of values.");
//        marks = "Not possible";
//        age = 3.5;
        System.out.println("Think of it like this, a cubic container can hold a cubic object, " +
                "a cylindrical container can hold a cylindrical object, etc.");
        System.out.println();

//        byte, long, short
        System.out.println("Sometimes, we need to store only ver small numbers.");
        System.out.println("We can use byte (-128 to +127) or short (-32768 to +32767).");
        byte smallNumber = 5;
        short aBiggerNumber = 1024;
        System.out.println(smallNumber);
        System.out.println(aBiggerNumber);
        System.out.println("Sometimes we must store larger numbers that cannot be stored in an int.");
        System.out.println("We can use long (-(2^63) to (2^63)-1 to store numbers that int variables can't hold.");
        System.out.println("Long numbers must be denoted using L at the end.");
        long veryLargeNumber = 5147483647L;
        System.out.println(veryLargeNumber);

//        Float & double
        System.out.println("For decimal numbers, we use float or double.");
        System.out.println("For float, we must use f at the end of the value.");
        float pi = 3.14f;
        double average = 5.7893;
        System.out.println("PI: " + pi);
        System.out.println("Average: " + average);
        System.out.println();

//        Char
        System.out.println("For an individual character, we use char. " +
                "A char variable holds a single character wrapped in single quotes.");
        char firstLetter = 'A';
        char grade = 'c';
        System.out.println("A number wrapped in single quotes is considered a character.");
        char level = '7';
        System.out.println("Characters can also hold special characters like question mark, colon, even space.");
        char questionMark = '?';
        char star = '*';
        char currencySymbol = '$';
        System.out.println("First letter of English alphabet: " + firstLetter);
        System.out.println("Question mark: " + questionMark);
        System.out.println();

//        Boolean
        System.out.println("In programming, we need to know if a condition is true or false. " +
                "To store true or false values in Java, we use the boolean datatype.");
        boolean isValid = true;
        boolean hasCompleted = false;
        System.out.println("Is valid? " + isValid);
        System.out.println("Has completed? " + hasCompleted);
        System.out.println("Booleans are important in performing comparisons and " +
                "executing different code based on whether a condition is true or false.");
        System.out.println("We will learn more about booleans when learning about control statements.");
        System.out.println();

//        Strings
        System.out.println("String is also a datatype in Java, but it is a different kind of datatype.");
        System.out.println("Strings are objects, unlike the others we've looked at so far, " +
                "which are primitive datatypes.");
        System.out.println("However, some of the basic concepts we've looked at so far still apply to strings.");
        System.out.println("We will learn more in detail about strings and classes and objects in future.");
        System.out.println("Strings must be wrapped inside double quotes.");
        String name = "Walter";
        String email = "test@test.com";
        System.out.println(name);
        System.out.println(email);
        System.out.println();
    }
}
