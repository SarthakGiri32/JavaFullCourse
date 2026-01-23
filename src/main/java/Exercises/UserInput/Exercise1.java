package Exercises.UserInput;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        // Calculate the area of a rectangle

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the width of the rectangle: ");
        double width = userInput.nextDouble();

        System.out.print("Enter the length of the rectangle: ");
        double length = userInput.nextDouble();

        double areaOfRectangle = length * width;

        System.out.printf("The area of the rectangle is: %.2f cm²%n", areaOfRectangle);

        userInput.close();
        // good practice to close the scanner object to avoid unexpected behavior

    }
}
