package Tutorials.MathClass;

public class MathClassTutorial {
    public static void main(String[] args) {
        
        // 1. Math constants
        // System.out.println(Math.PI); // prints the value of the mathematical constant 'pi'
        // System.out.println(Math.E); // prints the value of the mathematical constant 'e' (euler's number)

        // 2. pow()
        // double result = Math.pow( 2, 3);
        // double result = Math.pow( 2, 4);
        // double result = Math.pow( 2, 5);
        // Returns the value of the first argument raised to the power of the second argument.

        // 3. abs()
        // int result = Math.abs(-65);
        /*
        Returns the absolute value of an int value. If the argument is not negative, the argument is returned. 
        If the argument is negative, the negation of the argument is returned.
        */

        // 4. sqrt()
        // double result = Math.sqrt(9);
        // the result is the double value closest to the true mathematical square root of the argument value.

        // 5. round()
        // long result = Math.round(5.6432);
        // Returns the closest long to the argument, with ties rounding to positive infinity.

        // 6. ceil()
        // double result = Math.ceil(45.462344);
        /*
        Returns the smallest (closest to negative infinity) double value that is greater than or equal to the argument and
        is equal to a mathematical integer.
        */
        
        // 7. floor()
        // double result = Math.floor(45.762344);
        /*
        Returns the largest (closest to positive infinity) double value that is less than or equal to the argument and 
        is equal to a mathematical integer
        */

        // 8. max()
        // int result = Math.max(45, 31);
        /*
        Returns the greater of two int values. That is, the result is the argument closer to the value of Integer.MAX_VALUE. 
        If the arguments have the same value, the result is that same value.
        */
        
        // 9. min()
        float f1 = (float) 3.764, f2 = (float) 3.762;
        float result = Math.min(f1, f2);
        /*
        Returns the smaller of two float values. That is, the result is the value closer to negative infinity. 
        If the arguments have the same value, the result is that same value. If either value is NaN, then the result is NaN. 
        Unlike the numerical comparison operators, this method considers negative zero to be strictly smaller than positive zero. 
        If one argument is positive zero and the other is negative zero, the result is negative zero.
        */

        System.out.println(result);

    }
}
