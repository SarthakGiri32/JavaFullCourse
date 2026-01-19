package Exercises.MathClass;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        
        // given the radius, find the circumference, area (of a circle) and volume (of a sphere)
        // run the command 'chcp 65001' in command prompt to display the '³' superscript

        Scanner userInputScanner = new Scanner(System.in);

        System.out.print("Enter the radius (in cm): ");
        float radius = userInputScanner.nextFloat();

        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);
        double volume = (4 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.printf("The circumference is: %.1f cm\n", circumference);
        System.out.printf("The area is: %.2f cm²\n", area);
        System.out.printf("The area is: %.3f cm³\n", volume);

        userInputScanner.close();

    }
}
