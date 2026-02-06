package CodingInterviewPrograms.BrightChamps.TechnicalRound;

public class PrimeNumbers {

    public static void main(String[] args) {
        System.out.println(isPrime(57));
        System.out.println(isPrime(13));
        System.out.println(isPrime(101));
        System.out.println(isPrime(89));
        System.out.println(isPrime(49));
    }

    /**
     * To check if a number is prime, testing divisibility from 2 up to the square root of the number. 
     * This is efficient because if a number has a divisor greater than its square root, it must also have a corresponding divisor 
     * smaller than the square root. 
     * @param n
     * @return true if a number is prime, otherwise false
     */
    private static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }   
}
