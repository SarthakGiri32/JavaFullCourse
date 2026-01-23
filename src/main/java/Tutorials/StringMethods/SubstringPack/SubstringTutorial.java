package Tutorials.StringMethods.SubstringPack;

import java.util.Scanner;

public class SubstringTutorial {
    public static void main(String[] args) {
        
        // substring string method
        // String emailId = "wanderingmac@macandcheese.com";

        // String username = emailId.substring(0, emailId.indexOf("@"));
        // /* 
        // Returns a string that is a substring of this string. The substring begins at the specified 'beginIndex' and extends 
        // to the character at index 'endIndex - 1'. Thus the length of the substring is 'endIndex-beginIndex'
        // */
        // System.out.println(username);

        // String domain = emailId.substring(emailId.indexOf("@") + 1);
        // /* 
        // Returns a string that is a substring of this string. The substring begins with the character at the specified index
        // and extends to the end of this string
        // */
        // System.out.println(domain);

        Scanner userInputScanner = new Scanner(System.in);

        System.out.print("Enter your email id: ");
        String emailId = userInputScanner.nextLine();

        if (emailId.contains("@")) {
            String username = emailId.substring(0, emailId.indexOf("@"));
            String domain = emailId.substring(emailId.indexOf("@") + 1);

            System.out.println(username);
            System.out.println(domain);
        }
        else {
            System.out.println("Email ID must contain '@' symbol");
        }
        

        userInputScanner.close();

    }
}
