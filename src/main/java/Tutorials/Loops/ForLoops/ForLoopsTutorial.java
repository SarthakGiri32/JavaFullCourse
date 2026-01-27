package Tutorials.Loops.ForLoops;

import java.util.Scanner;

public class ForLoopsTutorial {
    public static void main(String[] args) {
        
        // for (int i = 1; i <= 10; i++) {
        //     // System.out.println("Chicken wings");
        //     System.out.println(i);
        // }
        // executes any code in its body for a definite amount of time (depending on the loop counter variable 'i')

        // 1. decrementing i through for loop
        // for (int i = 10; i >= 1; i--) {
        //     System.out.println(i);
        // }

        // 2. incrementing i by 3
        // for (int i = 1; i <= 10; i += 3) {
        //     System.out.println(i);
        // }

        // 3. decrementing by 2
        // for (int i = 10; i >= 1; i -= 2) {
        //     System.out.println(i);
        // }

        // 4.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the loop count: ");
        int max = scanner.nextInt();

        for (int i = 1; i <= max; i++) {
            System.out.println(i);
        }

        scanner.close();

    }
}
