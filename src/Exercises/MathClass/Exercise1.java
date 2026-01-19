package Exercises.MathClass;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        
        // find the hypotenuse of a right angle triangle

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the length of side A (in cm): ");
        float a = userInput.nextFloat();

        System.out.print("Enter the length of side B (in cm): ");
        float b = userInput.nextFloat();

        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("The hypotenuse (side C) is: " + c + " cm");

        userInput.close();

    }
}
