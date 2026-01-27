package Tutorials.WhileLoops.DoWhileLoopsTutorialPackage;

import java.util.Scanner;

public class DoWhileLoopsTutorial {
    public static void main(String[] args) {
        
        // 1. Do while loop
        // Scanner scanner = new Scanner(System.in);

        // int age = 0;

        // do {
        //     System.out.println("Your age cannot be negative!");
        //     System.out.print("Enter your age: ");
        //     age = scanner.nextInt();
        // } while (age < 0);
        // // the do-while loop is executed at least once, even if the condition for the loop is initially false

        // System.out.printf("You are %d years old", age);

        // scanner.close();

        // 2.
        Scanner scanner = new Scanner(System.in);

        int number = 0;

        // number = 7;
        // while (number < 1 || number > 10) {
        //     System.out.print("Enter a number 1 and 10: ");
        //     number = scanner.nextInt();
        // }
        // standard while loop will not be executed if during initialization 'number' is between 1 and 10

        number = 6; // even though number is between 1 and 10, the do while loop is executed once, and then the loop condition is checked
        do {
            System.out.print("Enter a number 1 and 10: ");
            number = scanner.nextInt();
        } while (number < 1 || number > 10);

        System.out.printf("You picked %d\n", number);

        scanner.close();
    }
}
