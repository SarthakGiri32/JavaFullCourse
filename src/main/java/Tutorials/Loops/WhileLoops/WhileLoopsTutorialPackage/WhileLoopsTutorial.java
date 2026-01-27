package Tutorials.Loops.WhileLoops.WhileLoopsTutorialPackage;

import java.util.Scanner;

public class WhileLoopsTutorial {
    public static void main(String[] args) {
        
        // 1. A small demo of if statements, and highlighting its inefficiency when dealing with code repetition

        // Scanner userInputScanner = new Scanner(System.in);

        // String name = "";

        // if (name.isEmpty()) {
        //     System.out.print("Enter your name: ");
        //     name = userInputScanner.nextLine();
        // }

        // System.out.printf("Hello %s\n", name);
        // this print statement will execute even if 'name' is empty after accepting user input
        // this can be fixed with a while loop

        // 2. Using a while loop to deal with empty user input

        // while (name.isEmpty()) {
        //     System.out.print("Enter your name: ");
        //     name = userInputScanner.nextLine();
        // }
        // indefinitely running while loop that will keep running as long as 'name.isEmpty()' is true (the length of 'name' is 0)

        // System.out.printf("Hello %s\n", name);

        // userInputScanner.close();

        // 3. Infinite loop should be avoided at all costs!

        /*
        a condition inside a while loop header that does not change, resulting in the while loop running forever, without stopping, resulting
        in a system crash.
        */

        // indefinitely running while loop (not an infinite loop, but will run until the condition is changed inside the loop)
        // Scanner scanner = new Scanner(System.in);

        // String userResponse = "";

        // while (!userResponse.equals("Q")) {
        //     System.out.println("You are playing a game!");
        //     System.out.print("Enter Q to quit: ");
        //     userResponse = scanner.next().toUpperCase();
        // }

        // System.out.println("You have quit the game!");

        // scanner.close();

        // 4. verifying age

        Scanner scanner = new Scanner(System.in);

        int age = 0;

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        while (age < 0) {
            System.out.println("Your age cannot be negative!");
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
        }
        /* the while loop will be skipped if the condition 'age < 0' is initially false, before the 1st run of the while loop, 
        if the user enters a positive integer value at the 1st prompt */

        System.out.printf("You are %d years old", age);

        scanner.close();
        
    }
}
