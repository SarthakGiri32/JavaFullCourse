package Projects.WeightConvertorPackage;

import java.util.Scanner;

public class WeightConvertor {
    public static void main(String[] args) {
        
        // Weight conversion program (lbs <=> kg)

        // 1. Welcome message, and initializing welcome message variables
        String welcomeMessage = " ".repeat((50 - "Weight Conversion Program".length()) / 2) + "Weight Conversion Program";
        String weightConversionOption1 = " ".repeat((50 - "1. Convert lbs to kg".length()) / 2) + "1. Convert lbs to kg";
        String weightConversionOption2 = " ".repeat((50 - "2. Convert kg to lbs".length()) / 2) + "2. Convert kg to lbs";
        // repeat(): Returns a string whose value is the concatenation of this string repeated 'count' times.

        System.out.println("*".repeat(50));
        System.out.println(welcomeMessage);
        System.out.println(weightConversionOption1);
        System.out.println(weightConversionOption2);
        System.out.println("*".repeat(50));

        // 2. Accepting user input using scanner class object, and initializing user input variables
        
        Scanner userInputScanner = new Scanner(System.in);

        System.out.print("Choose an option: ");
        int userChoice = userInputScanner.nextInt();

        System.out.println(userChoice);

        // 3. Option 1: converting Kg to Lbs

        // 4. Option 2: converting Lbs to Kg

        // 5. Else: print user error message: 'not a valid conversion choice'

        // 6. close scanner object

        userInputScanner.close();

    }
}
