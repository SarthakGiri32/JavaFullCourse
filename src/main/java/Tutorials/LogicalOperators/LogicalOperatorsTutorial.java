package Tutorials.LogicalOperators;

import java.util.Scanner;

public class LogicalOperatorsTutorial {
    public static void main(String[] args) {
        
        // 1. &&: Logical AND operator

        // double temp = 29.99;
        // boolean isSunny = true;

        // all conditions linked by the '&&' operator have to be true
        // if (temp <= 30 && temp >= 0 && isSunny) {
        //     System.out.println("The weather is pleasant 😃");
        //     System.out.println("It is sunny outside ☀️");
        // }

        // 2. !: Logical NOT operator
        // temp = 29.99;
        // isSunny = false;

        // '!' reverses the boolean value of a condition or a composite condition
        // if (temp <= 30 && temp >= 0 && isSunny) {
        //     System.out.println("The weather is pleasant 😃");
        //     System.out.println("It is sunny outside ☀️");
        // }
        // else if (temp <= 30 && temp >= 0 && !isSunny) {// condition '!isSunny' reverses the value of isSunny. True becomes false and vice versa
        //     System.out.println("The weather is pleasant 😃");
        //     System.out.println("It is cloudy outside ☁️");
        // }

        // 3. ||: Logical OR operator
        // temp = -30;
        // temp = 49;
        // isSunny = true;

        // if (temp <= 30 && temp >= 0 && isSunny) {
        //     System.out.println("The weather is pleasant 😃");
        //     System.out.println("It is sunny outside ☀️");
        // }
        // else if (temp <= 30 && temp >= 0 && !isSunny) {
        //     System.out.println("The weather is pleasant 😃");
        //     System.out.println("It is cloudy outside ☁️");
        // }
        // else if (temp > 30 || temp < 0) {
        //     // any one of the conditions linked by '||' operator has to be true
        //     System.out.println("The weather is too extreme 😣😭");
        // }

        // 4. Verify an username set by a user

        Scanner userInputScanner = new Scanner(System.in);

        /*
        Username verification rules:
            1. length must be between 4-12 characters
            2. must not contain spaces or underscores
        */
       
        System.out.print("Enter your new username: ");
        String username = userInputScanner.nextLine();

        if (username.length() < 4 || username.length() > 12) {
            System.out.println("❌ Username length should be between 4 and 12 characters");
            if (username.contains(" ") || username.contains("_")) {
                System.out.println("❌ Username should not contain spaces or underscores");
            }
            else {
                System.out.println("✅ Username does not contain spaces or underscores");
            }
        }
        else if (username.contains(" ") || username.contains("_")) {
            System.out.println("✅ Username length is between 4 and 12 characters");
            System.out.println("❌ Username should not contain spaces or underscores");
        }
        else {
            System.out.println("✅ Username length is between 4 and 12 characters");
            System.out.println("✅ Username does not contain spaces or underscores");
            System.out.printf("Welcome %s\n", username);
        }

        userInputScanner.close();

    }
}
