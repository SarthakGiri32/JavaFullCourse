package Tutorials.Methods.MethodsTutorialPackage;

public class MethodsTutorial {
    public static void main(String[] args) {
        
        // 1. demonstrating code not written in a method (inefficient code reuse)

        // System.out.println("Happy birthday to you");
        // System.out.println("Happy birthday to you");
        // System.out.println("Happy birthday dear Anthony");
        // System.out.println("Happy birthday to you");
        // System.out.println("You are 28 years old\n");

        // System.out.println("Happy birthday to you");
        // System.out.println("Happy birthday to you");
        // System.out.println("Happy birthday dear Anthony");
        // System.out.println("Happy birthday to you");
        // System.out.println("You are 28 years old\n");

        // System.out.println("Happy birthday to you");
        // System.out.println("Happy birthday to you");
        // System.out.println("Happy birthday dear Anthony");
        // System.out.println("Happy birthday to you");
        // System.out.println("You are 28 years old\n");
        
        /* 
        as you can see, without using methods, reusing the same code block takes up valuable code space and memory space,
        and makes the code potentially difficult to understand
        */

        // 2. Using a method for efficient code reuse
        // happyBirthdayGreeting();
        // Cannot make a static reference to the non-static method happyBirthdayGreeting() from the type MethodsTutorial
        // hence 'static' has been added to the method definition
        // happyBirthdayGreeting();
        // happyBirthdayGreeting();
        /*
        using functions reduces the code clutter, improves readability, and allows efficient code reuse without the need to copy paste
        potentially 1000s of lines of code.
        */

        // 3. functions with arguments
        // for use with functions that can produce different outputs based on the values of its arguments
        // String userName = "Sarthak Giri";
        // int userAge = 98;
        // happyBirthdayGreetingWithParams(userName, userAge);
        // values passed to a function during function call are known as arguments
        /* the variable names for arguments and parameters can be different, 
        since only the values are passed from the function call to the function body */
        // happyBirthdayGreetingWithParams("Joe Sanders", 432);
        // happyBirthdayGreetingWithParams("Patrick", 38);

        // 4. functions with return values
        // the value returned from the function call can be either stored in a variables or displayed directly to the system output
        // System.out.println(square(62));
        // System.out.println(cube(41));
        // System.out.println(getFullName("Sarthak", "Darknet"));
        // System.out.println(getFullName("Spongebob", "Squarepants"));

        int userAge = 34;
        userAge = 17;
        
        if (isValidAge(userAge)) {
            System.out.println("You may register for the credit card");
        }
        else {
            System.out.println("You cannot register for the credit card");
        }
    }

    /**
     * This is a basic function. A function should have:
     * 1. function name: naming convention similar to variables
     * 2. return type: if no value is returned to the function call, the return type is 'void'
     * 3. parameters (optional): any values accepted by the function for use in the function code
     * 4. static: to call the function from other static functions (like the main() function) (and some other uses)
     * There a few more tokens that will be used in advanced sections of the tutorial
     */
    static void happyBirthdayGreeting() {
        System.out.println("Happy birthday to you");
        System.out.println("Happy birthday to you");
        System.out.println("Happy birthday dear Anthony");
        System.out.println("Happy birthday to you");
        System.out.println("You are 28 years old\n");
    }

    /**
     * This function prints a custom happy birthday greeting message
     * @param name - The name of the person for the custom greeting
     * @param age - The age of the person for the custom greeting
     */
    static void happyBirthdayGreetingWithParams(String name, int age) {
        System.out.println("\nHappy birthday to you");
        System.out.println("Happy birthday to you");
        System.out.printf("Happy birthday dear %s\n", name);
        System.out.println("Happy birthday to you");
        System.out.printf("You are %d years old\n", age);
    }

    /**
     * A function to return the square of a number
     * @param number - a 'double' type parameter which is squared in the function
     * @return the square of the parameter using the 'Math.pow()' method
     */
    static double square(double number) {
        return Math.pow(number, 2);
        // 'return' keyword is used to return a value from a function
        /* the function stops running, and the control flow exits the function back to the function call after the 'return' keyword,
           along with the value being returned from the function. The data type of the return value should be mentioned in the
           function definition */
    }

    /**
     * A function that returns the cube of a number
     * @param number - 'double' type parameter that will be cubed by the function
     * @return the cube value of the aforementioned parameter
     */
    static double cube(double number) {
        return Math.pow(number, 3);
    }

    /**
     * Concatenates the first and last names of a user and returns the combined name
     * @param firstName - the first name of the user
     * @param lastName - the last name of the user
     * @return the combined full name of the user after concatenating the aforementioned parameters
     */
    static String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    /**
     * Returns true if the age of the user is greater than or equal 18, or false otherwise
     * @param age - the current age of the user
     * @return true or false based on the value of the aforementioned parameter
     */
    static Boolean isValidAge(int age) {
        return (age >= 18) ? true : false;
    }
}
