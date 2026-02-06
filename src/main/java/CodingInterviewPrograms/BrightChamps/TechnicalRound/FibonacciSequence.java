package CodingInterviewPrograms.BrightChamps.TechnicalRound;

public class FibonacciSequence {
    public static void main(String[] args) {
        int a = 0, b = 1, c = 0, n = 34, i = 0;
        String output = "";
        
        while (i <= n) {
            output += a + ", ";

            c = a + b;
            a = b;
            b = c;
            i++;
        }
        output = output.trim().substring(0, output.lastIndexOf(","));

        System.out.printf("Fibonacci Sequence of length %d:\n%s\n", n, output);
    }
}
