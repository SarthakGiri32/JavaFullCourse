package Tutorials.RandomNumbers;

import java.util.Random;

public class RandomNumbersTutorial {
    public static void main(String[] args) {
        
        Random random = new Random();

        // 1. nextInt()
        // int number = random.nextInt(); // the numbers generated are generally very large
        /*
        Returns the next pseudorandom, uniformly distributed int value from this random number generator's sequence. 
        The general contract of nextInt is that one int value is pseudo-randomly generated and returned. 
        All 2^32^ possible int values are produced with (approximately) equal probability.
        */

        // int number1 = random.nextInt(1, 7); // origin: inclusive; bound: exclusive
        // int number2 = random.nextInt(1, 7);
        // int number3 = random.nextInt(1, 7);

        // System.out.println(number1);
        // System.out.println(number2);
        // System.out.println(number3); // 3 dice roles

        // int number1 = random.nextInt(1, 101);
        // int number2 = random.nextInt(1, 101);
        // int number3 = random.nextInt(1, 101);

        // System.out.println(number1);
        // System.out.println(number2);
        // System.out.println(number3);

        // 2. nextDouble()
        // double number = random.nextDouble();
        /*
        Returns the next pseudorandom, uniformly distributed double value between 0.0 and 1.0 from this random number generator's sequence.

        The general contract of nextDouble is that one double value, chosen (approximately) uniformly from the range 0.0d (inclusive) to 
        1.0d (exclusive), is pseudo-randomly generated and returned.
        */
        // System.out.println(number);

        // 3. nextBoolean()
        boolean isHeads = random.nextBoolean();
        /*
        Returns the next pseudorandom, uniformly distributed boolean value from this random number generator's sequence. 
        The general contract of nextBoolean is that one boolean value is pseudo-randomly generated and returned. The values true and 
        false are produced with (approximately) equal probability.
        */
        
        if (isHeads) {
            System.out.println("Heads");
        }
        else {
            System.out.println("Tails");
        }

    }
}
