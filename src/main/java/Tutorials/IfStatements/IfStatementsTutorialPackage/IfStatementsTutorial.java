package Tutorials.IfStatements.IfStatementsTutorialPackage;

// to run this file (currently running in java 24):
// run 'chcp 65001' in command prompt
// run 'java -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 Yourjavafile.java' in command prompt

import java.util.Scanner;

public class IfStatementsTutorial {
    public static void main(String[] args) {
        
        // if statements: execute a block of code if a condition is true

        // int age = 76;
        // int age = 12;
        // int age = 19;
        // int age = -21;
        // int age = 0;
        // int age = 50;

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = userInput.nextLine();
        
        System.out.print("Enter your age: ");
        int age = userInput.nextInt();

        System.out.print("Are you a student (true/false)?: ");
        boolean isStudent = userInput.nextBoolean();

        // Group 1: check whether 'name' is empty
        if (name.isEmpty()) { // Returns true if, and only if, length() is 0.
            System.out.println("You didn't enter your name! 😾");
        }
        else {
            System.out.println("Hello " + name + "! 😃");
        }

        // Group 2: check the value of 'age'
        if (age >= 65) {
            System.out.println("You are a senior! 👴");
        }
        else if (age >= 18) {
            System.out.println("You are an adult! 👨");           
        }
        else if (age < 0) {
            System.out.println("You haven't been born yet! 😇");
        }
        else if (age == 0) {
            System.out.println("You are a baby! 👶");
        }
        else {
            System.out.println("You are a child! 👦");
        }

        // Group 3:
        if (isStudent) {
            System.out.println("You are a student! 🏫");
        }
        else {
            System.out.println("You are not a student! 🏢");
        }

        userInput.close();

    }
}
