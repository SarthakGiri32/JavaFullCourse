package CodingInterviewPrograms.BrightChamps.TechnicalRound;

public class SwappingIntegers {
    public static void main(String[] args) {
        
        // Swapping numbers without using a 3rd variable
        int a = 3455, b = 7645;
        System.out.printf("a: %d; b: %d\n", a, b);

        b += a;
        a = b - a;
        b = b - a;

        System.out.printf("a: %d; b: %d\n", a, b);
        
    }
}
