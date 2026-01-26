package Tutorials.EnhancedSwitches;

import java.util.Scanner;

public class EnhancedSwitchesTutorial {
    public static void main(String[] args) {
        
        // enhanced switches - a replacement for huge number of if-else-if-else statements
        // (java 14 feature)

        Scanner userInputScanner = new Scanner(System.in);

        System.out.print("Enter the day of the week: ");
        String dayOfWeek = userInputScanner.next();

        String output = switch (dayOfWeek) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "It's a weekday 😭😭";
            case "Saturday", "Sunday" -> "It's the weekend 😃😃";
            default -> String.format("⚠️ '%s' is an invalid day of the week name ⚠️", dayOfWeek);
        };
        /*
        The arrow operator (->) in Java's enhanced switch statements replaces the 
        traditional ':' and 'break' syntax, providing a more concise and readable way 
        to define case labels and their corresponding values or expressions.

        No Fall-Through: Unlike traditional switches, the arrow syntax prevents fall-through by design; only the matched case is executed. 
        */

        System.out.println(output);

        userInputScanner.close();
    }
}
