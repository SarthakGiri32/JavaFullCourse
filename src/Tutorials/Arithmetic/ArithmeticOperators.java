package Tutorials.Arithmetic;

public class ArithmeticOperators {
    public static void main(String[] args) {
        
        // 1. Arithmetic operators
        // int x = 10, y = 2, z;

        // z = x + y;
        // z = x - y;
        // z = x * y;
        // z = x / y; // returns the quotient of division (integer division)
        // y = 3;
        // z = x % y;
        // System.out.println(z);

        // 2. Augmented assignment operator
        // int x = 10, y = 3;

        // x += y; // similar to x = x + y
        // x -= y; // similar to x = x - y
        // x *= y; // similar to x = x * y
        // y = 2;
        // x /= y; // similar to x = x / y
        // x %= y; // similar to x = x % y

        // System.out.println(x);

        // 3. Increment and Decrement operators
        // int x = 1;

        // x++; // similar to x += 1 or x = x + 1
        // x++;
        // x++;

        // x--; // similar to x -= 1 or x = x - 1
        // x--;
        // x--;

        // System.out.println(x);

        // 4. Order of operations (P-E-M-D-A-S)
        // Parenthesis - Exponent - Multiplication - Division - Addition - Subtraction

        double result = 3 + 4 * (7 - 5) / 2.0;

        System.out.println(result);

    }
}
