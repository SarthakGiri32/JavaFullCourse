package Tutorials.UserInput;
import java.util.Scanner;

public class UserInputUsingScanner {
    public static void main(String[] args) {
        // creating a scanner object
        Scanner scannerInput = new Scanner(System.in);

//        // printing the prompt to enter a name
//        System.out.println("Enter your name:");
//        String inputName = scannerInput.nextLine();
//
//        System.out.print("Enter your age: ");
//        int age = scannerInput.nextInt();
//
//        System.out.print("Enter your CGPA: ");
//        float cgpaGrade = scannerInput.nextFloat();
//
//        System.out.print("Are you a students? (true/false): ");
//        boolean isStudent = scannerInput.nextBoolean();
//        Scans the next token of the input into a boolean value and returns that value
//
//        System.out.println("\nHello " + inputName + "! Welcome to user input tutorial");
//        System.out.println("You are " + age + " years old");
//        System.out.println("Your CGPA is " + cgpaGrade);
//        System.out.println("Are you a Student?: " + isStudent);
//
//        if (isStudent) {
//            System.out.println("You are enrolled as a student in a university");
//        }
//        else {
//            System.out.println("You are not enrolled as a student in a university");
//        }

        // Common Issues
//        System.out.print("Enter you age: ");
//        int age = scannerInput.nextInt();
//
//        System.out.print("Enter your favorite color: ");
//        String color = scannerInput.nextLine();
//
//        System.out.println("You are " + age + " years old");
//        System.out.println("You like the color " + color);

        /*
        * When we are entering a number (say, 25) and hitting 'Enter' on the keyboard, the input buffer sees that as '25\n', after the number has been
        * taken as input using 'nextInt()', there's still the newline character '\n' in the input buffer. So, the 'nextLine()' is picking up the '\n'
        * as the next string input and storing it in the 'color' variable, which is why the prompt for entering the color never occurs, since the
        * 'nextLine()' has already stored the '\n' and completed execution
        */

        // 1. fixing by using an unassigned 'nextLine()' function call
        System.out.print("Enter you age: ");
        int age = scannerInput.nextInt();
        scannerInput.nextLine();

        System.out.print("Enter your favorite color: ");
        String color = scannerInput.nextLine();

        System.out.println("You are " + age + " years old");
        System.out.println("You like the color " + color);

        // closing the scanner object at the end of the code; good coding practice
        scannerInput.close();
    }
}
