package Projects.CalculatorProgramPackage;

import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args) {
        
        Scanner userInputScanner = new Scanner(System.in);
        double result = 0; boolean isValidOperation = true;

        System.out.print("Enter the 1st number: ");
        double inputNumber1 = userInputScanner.nextDouble();

        System.out.print("Enter the arithmetic operator (+, -, *, /, ^): ");
        char arithmeticOperator = userInputScanner.next().charAt(0); // returns th 1st character of the input string

        System.out.print("Enter the 2nd number: ");
        double inputNumber2 = userInputScanner.nextDouble();

        switch(arithmeticOperator) {
            case '+' -> result = inputNumber1 + inputNumber2;
            case '-' -> result = inputNumber1 - inputNumber2;
            case '*' -> result = inputNumber1 * inputNumber2;
            case '/' -> {
                if (inputNumber2 != 0) {
                    result = inputNumber1 / inputNumber2;
                }
                else {
                    System.out.println("Division by zero will result in 'infinity'");
                    isValidOperation = false;
                }
            }
            case '^' -> result = Math.pow(inputNumber1, inputNumber2);
            default -> {
                System.out.println("Invalid arithmetic operator option");
                isValidOperation = false;
            }
        }

        if (isValidOperation) System.out.printf("%.4f %c %.4f = %.4f\n", inputNumber1, arithmeticOperator, inputNumber2, result);

        userInputScanner.close();

    }
}
