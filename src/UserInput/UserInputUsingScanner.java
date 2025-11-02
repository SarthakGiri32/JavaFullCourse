package UserInput;
import java.util.Scanner;

public class UserInputUsingScanner {
    public static void main(String[] args) {
        // creating a scanner object
        Scanner scannerInput = new Scanner(System.in);

        // printing the prompt to enter a name
        System.out.println("Enter your name:");
        String inputName = scannerInput.nextLine();

        System.out.println("Enter your age:");
        int age = scannerInput.nextInt();

        System.out.println("Enter your cgpa:");
        float cgpaGrade = scannerInput.nextFloat();

        System.out.println("Hello " + inputName + "! Welcome to user input tutorial.");
        System.out.println("The number of your years is " + age);
        System.out.println("Your cgpa is: " + cgpaGrade);

        // closing the scanner object at the end of the code; good coding practice
        scannerInput.close();
    }
}
