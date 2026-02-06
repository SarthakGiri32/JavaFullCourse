package CodingInterviewPrograms.BrightChamps.TechnicalRound;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseString {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String userInput = validatingUserInput(bufferedReader);

        System.out.println(reverseString(userInput));
    }

    private static String validatingUserInput(BufferedReader inputReader) throws IOException {

        String inputString = "";

        do {
            System.out.print("Enter a string: ");
            inputString = inputReader.readLine();
        } while(inputString.isEmpty());
        
        return inputString;

    }

    private static String reverseString(String initialString) {

        String reversedString = "";

        for (int i = initialString.length() - 1; i >= 0; i--) {
            reversedString += initialString.charAt(i);
        }

        return reversedString;

    }
}
