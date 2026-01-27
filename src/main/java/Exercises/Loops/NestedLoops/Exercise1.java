package Exercises.Loops.NestedLoops;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        
        // print a matrix of rows and columns based on user input

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        System.out.print("Enter the symbol to print: ");
        char symbol = scanner.next().charAt(0);

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }

        scanner.close();

    }
}
