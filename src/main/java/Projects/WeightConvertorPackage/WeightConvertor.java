package Projects.WeightConvertorPackage;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class WeightConvertor {
    public static void main(String[] args) {
        
        // Weight conversion program (lbs <=> kg)

        // 1. Welcome message, and initializing welcome message variables

        String welcomeMessage = StringUtils.center("Weight Conversion Program", 50);
        String weightConversionOption1 = StringUtils.center("1. Convert lbs to kg", 50);
        String weightConversionOption2 = StringUtils.center("2. Convert kg to lbs", 50);
        // StringUtils.center(): Centers a String in a larger String of size size. Uses a supplied character as the value to pad the String with.

        System.out.println("*".repeat(50));
        System.out.println(welcomeMessage);
        System.out.println(weightConversionOption1);
        System.out.println(weightConversionOption2);
        System.out.println("*".repeat(50));

        // 2. Accepting user input for choice using scanner class object, and initializing user input and output variables
        
        Scanner userInputScanner = new Scanner(System.in);
        String output = "";

        try {

            System.out.print("Choose an option: ");
            int userChoice = userInputScanner.nextInt();

            /* 
            3. Create an if statement block for weight conversion
                a) Option 1: converting Kg to Lbs
                    i) Accept user input for weight in kg
                    ii) Convert from kg to lbs
                    iii) print the converted weight
                b) Option 2: converting Lbs to Kg
                    i) Accept user input for weight in lbs
                    ii) Convert from lbs to kg
                    iii) print the converted weight
                c) Else: print user error message: 'not a valid conversion choice'
                    i) Print an error message
            */
            if (userChoice == 1) {
                System.out.print("Enter the weight in lbs: ");
                double userWeight = userInputScanner.nextDouble();
                double userConvertedWeight = userWeight * 0.4535924;
                System.out.println("*".repeat(50));
                output = StringUtils.center(String.format("The weight converted to kg: %.3f kg", userConvertedWeight), 50);
            }
            else if (userChoice == 2) {
                System.out.print("Enter the weight in kg: ");
                double userWeight = userInputScanner.nextDouble();
                double userConvertedWeight = userWeight * 2.204623;
                System.out.println("*".repeat(50));
                output = StringUtils.center(String.format("The weight converted to lbs: %.3f lbs", userConvertedWeight), 50);
            }
            else {
                System.out.println("*".repeat(50));
                output = StringUtils.center("You have not entered a valid conversion option!", 50);
            }
            
        }
        catch (InputMismatchException inputMismatch) {

            System.out.println("*".repeat(50));
            output = StringUtils.center("You have not entered an integer choice value!", 50);

        }
        finally {

            System.out.println(output);
            System.out.println("*".repeat(50));

            // 4. close scanner object

            userInputScanner.close();

        }
    }
}
