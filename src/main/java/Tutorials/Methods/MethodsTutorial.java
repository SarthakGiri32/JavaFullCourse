package Tutorials.Methods;

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
        happyBirthdayGreeting();
        // Cannot make a static reference to the non-static method happyBirthdayGreeting() from the type MethodsTutorial
        // hence 'static' has been added to the method definition
        happyBirthdayGreeting();
        happyBirthdayGreeting();
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
}
