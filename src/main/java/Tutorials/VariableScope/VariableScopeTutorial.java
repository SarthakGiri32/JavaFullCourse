package Tutorials.VariableScope;

public class VariableScopeTutorial {

    static int x = 23551234;
    // class-scoped 'x' variable (advanced: static class variables will have the same value across different objects of this class)
    // class-scoped variables can be accessed by other functions in the same class
    
    public static void main(String[] args) {
        /* 
        Variable scope in Java defines where a variable is accessible in a program.
        It determines the region (class, method, or block) where a variable can be referenced,
        ensuring proper visibility and memory management during execution.
        */

        // 1. Local scope (a variable declared in a class/function/block and being used in the same class/function/block)
        // typically, a local scope variable cannot be used outside its scope (outside the class/function/block in which it is defined)
        int x = 243566; // local-scope variable (inside main() function)
        // int x = 4234; // Duplicate local variable x
        System.out.println(x);

        doSomething();
        // the value of 'x' defined in the 'doSomething()' function is displayed

        // System.out.println(VariableScopeTutorial.x); // prints the class-scoped 'x' variable (static)

        // if 'x' is not defined in the main() function, the class-scoped 'x' variable is displayed
        /*
        for a variable named 'x', java will first prioritize local function scope, and if not found in the local function scope, 
        then java will search for the variable in the class scope
        */

    }

    static void doSomething() {
        int x = 4234; // local-scope variable (inside doSomething() function)
        // no warnings in java, since this 'x' is in a different scope than the 'x' of the main() function
        System.out.println(x);

        // if 'x' is not defined in the doSomething() function, the class-scoped 'x' variable is displayed
    }
}
