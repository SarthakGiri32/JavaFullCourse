package Tutorials.Printf;

public class PrintfTutorial {
    public static void main(String[] args) {
        
        // printf() - method to add special formatting to outputs
        // %[flags][width][.precision][specifier-character]

        // String name = "Harry";
        // char firstLetter = 'H';
        // int age = 35;
        // double height = 181.3;
        // boolean isEmployed = false;

        // 1. %[specifier-character]
        // System.out.printf("Hello %s\n", name); // %s: string
        // System.out.printf("Your name starts with a '%c'\n", firstLetter); // %c: character
        // System.out.printf("You are %d years old\n", age); // %d: integer
        // System.out.printf("You are %f centimeters tall\n", height); // %f: double/float
        // System.out.printf("Are you employed?: %b\n", isEmployed); // %b: boolean

        // System.out.printf("%s is %d years old", name, age); // can use multiple format specifiers at the same time

        // 2. %[.precision]f
        // double price1 = 9.99;
        // double price2 = 113.54;
        // double price3 = -43.87;

        /*
        without providing any precision value, zeroes are padded to the end till 6 decimal places 
        (if less than 6 floating point digits are present)
        */
        // System.out.printf("%.1f\n", price1);
        // System.out.printf("%.3f\n", price2);
        // System.out.printf("%.2f\n", price3);

        // 3. %[flags]
        // double price1 = 9.99;
        // double price2 = 113.54;
        // double price3 = -43.87;

        // a) + = output a plus sign for positive values

        // System.out.printf("%+.2f\n", price1);
        // System.out.printf("%+.2f\n", price2);
        // System.out.printf("%+.2f\n", price3);

        // b) , = a comma grouping separator for large values (for thousand, million, billion, etc)

        // price1 = 9000.99;
        // price2 = 113000.54;
        // price3 = -4300000000000.87;

        // System.out.printf("%,.2f\n", price1);
        // System.out.printf("%,.2f\n", price2);
        // System.out.printf("%,.2f\n", price3);

        // c) ( = negative numbers are enclosed in parenthesis

        // System.out.printf("%(.2f\n", price1);
        // System.out.printf("%(.2f\n", price2);
        // System.out.printf("%(.2f\n", price3);

        // System.out.printf("%(+.2f\n", price1);
        // System.out.printf("%(+.2f\n", price2);
        // System.out.printf("%(+.2f\n", price3); // the negative sign is overridden by the parenthesis

        // d) whitespace = whitespace if positive value and minus sign if negative value

        // System.out.printf("% .2f\n", price1);
        // System.out.printf("% .2f\n", price2);
        // System.out.printf("% .2f\n", price3);

        // System.out.printf("%( .2f\n", price1);
        // System.out.printf("%( .2f\n", price2);
        // System.out.printf("%( .2f\n", price3);

        // System.out.printf("%(+.2f\n", price1);
        // System.out.printf("%(+.2f\n", price2);
        // System.out.printf("%(+.2f\n", price3);

        // 4. [width]
        int id1 = 1;
        int id2 = 45;
        int id3 = 671;
        int id4 = 8234;
        // we can align these id values by setting a specific width in printf

        // 0 : zero padding
        // positive integer: right justified padding
        // negative integer: left justified padding

        // right justified
        System.out.printf("%9d\n", id1);
        System.out.printf("%9d\n", id2);
        System.out.printf("%9d\n", id3);
        System.out.printf("%9d\n", id4); 

        // left justified
        System.out.printf("%-5d\n", id1);
        System.out.printf("%-5d\n", id2);
        System.out.printf("%-5d\n", id3);
        System.out.printf("%-5d\n", id4);

        // zero padding (right justified)
        System.out.printf("%09d\n", id1);
        System.out.printf("%09d\n", id2);
        System.out.printf("%09d\n", id3);
        System.out.printf("%09d\n", id4); 

    }
}
