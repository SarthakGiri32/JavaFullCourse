package CodingInterviewPrograms.BrightChamps.TechnicalRound;

public class ValidatingVowelPresence {
    public static void main(String[] args) {
        
        // to check presence of vowels in a string using regular expressions
        System.out.println(isVowelPresent("Sarthak"));
        System.out.println(isVowelPresent("try"));

    }

    private static boolean isVowelPresent(String stringToCheck) {
        return stringToCheck.matches(".*[aeiou].*");
    }
}
