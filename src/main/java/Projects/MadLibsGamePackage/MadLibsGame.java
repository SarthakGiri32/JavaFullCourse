package Projects.MadLibsGamePackage;
import java.util.Scanner;

public class MadLibsGame {
    public static void main(String[] args) {

        // Mad Libs game
        Scanner userInput = new Scanner(System.in);

        String adjective1, noun1, adjective2, verb1, adjective3;

        System.out.print("Enter an adjective (description): ");
        adjective1 = userInput.nextLine();
        
        System.out.print("Enter a noun (person or animal): ");
        noun1 = userInput.nextLine();

        System.out.print("Enter an adjective (description): ");
        adjective2 = userInput.nextLine();

        System.out.print("Enter a verb ending with '-ing' (action): ");
        verb1 = userInput.nextLine();

        System.out.print("Enter an adjective (description): ");
        adjective3 = userInput.nextLine();

        System.out.printf("%nToday I went to a %s zoo.%n", adjective1);
        System.out.printf("In an exhibit, I saw a %s.%n", noun1);
        System.out.printf("%s was %s and %s!%n", noun1, adjective2, verb1);
        System.out.printf("I was %s!%n", adjective3);
        
        userInput.close();
    }

}
