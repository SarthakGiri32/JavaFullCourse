package Projects.NumberGuessingGamePackage;

import java.util.Random;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class NumberGuessingGame {
    public static void main(String[] args) {
        
        // Number guessing game

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int min = 1, max = 100, guess = 0, userAttemptsCounter = 0;
        int randomNumber = random.nextInt(min, max + 1);
        // generating a random number between 1 and 100 (inclusive) for the guessing game
        String guessRangeInfo = String.format("Guess an integer between %d and %d", min, max), attemptsCountOutput = "";
        
        System.out.println("*".repeat(50));
        System.out.println(StringUtils.center("Number guessing game", 50));
        System.out.println("*".repeat(50));
        System.out.println(StringUtils.center(guessRangeInfo, 50));
        System.out.println("*".repeat(50));

        do {
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            System.out.println("*".repeat(50));
            if (guess > randomNumber) {
                System.out.println(StringUtils.center("TOO HIGH! Try again", 50));
                System.out.println("*".repeat(50));
            }
            else if (guess < randomNumber) {
                System.out.println(StringUtils.center("TOO LOW! Try again", 50));
                System.out.println("*".repeat(50));
            }
            userAttemptsCounter++;
        } while (guess != randomNumber);

        System.out.println(StringUtils.center("You have won!", 50));
        attemptsCountOutput = String.format("Number of attempts: %d", userAttemptsCounter);
        System.out.println(StringUtils.center(attemptsCountOutput, 50));
        System.out.println("*".repeat(50));

        scanner.close();

    }
}
