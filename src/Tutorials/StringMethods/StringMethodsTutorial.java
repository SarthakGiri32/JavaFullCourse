package Tutorials.StringMethods;

public class StringMethodsTutorial {
    public static void main(String[] args) {
        
        String fullName = "John Payne";
        
        // 1. length()
        // Returns the length of this string. The length is equal to the number of Unicode code units in the string.
        // int fullNameLength = fullName.length();
        // System.out.printf("The length of your full name: %d\n", fullNameLength);

        // 2. charAt()
        /*
        Returns the char value at the specified index. An index ranges from 0 to length() - 1. 
        The first char value of the sequence is at index 0, the next at index 1, and so on, as for array indexing.
        If the char value specified by the index is a surrogate, the surrogate value is returned.
        */
        // char letter = fullName.charAt(5);
        // letter = fullName.charAt(2);
        // letter = fullName.charAt(7);
        // System.out.println(letter);

        // 3. indexOf()
        /*
        Returns the index within this string of the first occurrence of the specified substring.

        The returned index is the smallest value k for which:

        this.startsWith(str, k)

        If no such value of k exists, then -1 is returned.
        */
        // int index = fullName.indexOf("y");
        // index = fullName.indexOf(" ");
        // System.out.println(index);

        // 4. lastIndexOf()
        /*
        Returns the index within this string of the last occurrence of the specified substring. The last occurrence of the empty string "" is considered to occur at the index value this.length().

        The returned index is the largest value k for which:

        this.startsWith(str, k)

        If no such value of k exists, then -1 is returned.
        */
        // int lastIndex = fullName.lastIndexOf("n");
        // System.out.println(lastIndex);

        // 5. toUpperCase()
        /*
        Converts all of the characters in this String to upper case using the rules of the default locale. 
        This method is equivalent to toUpperCase(Locale.getDefault())
        */
        // fullName = fullName.toUpperCase();
        // System.out.println(fullName);

        // 6. toLoweCase()
        /*
        Converts all of the characters in this String to lower case using the rules of the default locale. 
        This method is equivalent to toLowerCase(Locale.getDefault())
        // */
        // fullName = fullName.toLowerCase();
        // System.out.println(fullName);

        // 7. trim()
        /*
        Returns a string whose value is this string, with all leading and trailing space removed, 
        where space is defined as any character whose codepoint is less than or equal to 'U+0020' (the space character).
        */
        // fullName = "     Max Payne             ";
        // System.out.println(fullName);
        // fullName = fullName.trim();
        // System.out.println(fullName);

        // 8. replace()
        /*
        Replaces each substring of this string that matches the literal target sequence with the specified literal replacement 
        sequence. The replacement proceeds from the beginning of the string to the end, for example, replacing "aa" with "b" 
        in the string "aaa" will result in "ba" rather than "ab".
        */
        // fullName = fullName.replace("n", "m");
        // System.out.println(fullName);

        // 9. isEmpty()
        // Returns true if, and only if, length() is 0.
        // fullName = "";
        // System.out.println(fullName.isEmpty());

        /* if (fullName.isEmpty()) {
            System.out.println("Your name is empty");
        }
        else {
            System.out.printf("Hello %s\n", fullName);
        } */

        // 9. contains()
        /* fullName = "johnpayne65";
        if (fullName.contains(" ")) { // Returns true if and only if this string contains the specified sequence of char values.
            System.out.println("You name contains a space");
        }
        else {
            System.out.println("Your name doesn't contain any spaces");
        } */

        // 10. equals()
        // String password = "yCy!6$4c1#&$54Bi^44&";
        /* 
        Compares this string to the specified object. The result is true if and only if the argument is not null and is a 
        String object that represents the same sequence of characters as this object.
        */
        //password = "password123456789";
        // if (password.equals("yCy!6$4c1#&$54Bi^44&")) {
        //     System.out.println("The password is correct");
        // }
        // else {
        //     System.out.println("The password is incorrect");
        // }

        // 11. equalsIgnoreCase()
        // fullName = "PASSWORD";
        /*
        Compares this String to another String, ignoring case considerations. Two strings are considered equal ignoring case 
        if they are of the same length and corresponding Unicode code points in the two strings are equal ignoring case.
        */
        if (fullName.equalsIgnoreCase("password")) {
            System.out.println("Your name cannot be 'password'");
        }
        else {
            System.out.printf("Hello %s\n", fullName);
        }

    }
}
