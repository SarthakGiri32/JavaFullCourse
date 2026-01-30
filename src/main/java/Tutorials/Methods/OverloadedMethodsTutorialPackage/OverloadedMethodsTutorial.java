package Tutorials.Methods.OverloadedMethodsTutorialPackage;

public class OverloadedMethodsTutorial {
    public static void main(String[] args) {
        
        // overloaded methods - methods that share the same name but different parameters

        // System.out.println(add(34, 20, 56));
        /* The method add(double, double) in the type OverloadedMethodsTutorial is not applicable for the arguments (int, int, int) */

        // System.out.println(add(54, 51));
        // System.out.println(add(31, 2, 92));
        // method overloading, since there are two versions of the 'add()' method having different parameters
        // System.out.println(add(51, 52, 87, 7));

        System.out.println(bakePizza("Whole bread"));
        System.out.println(bakePizza("thin crust", "parmesan"));
        System.out.println(bakePizza("sourdough", "pecorino romano", "bbq chicken"));

    }

    static double add(double a, double b) {
        return a + b;
    }

    // static double add(double a, double b) {
    //     return a + b + c;
    // } // Duplicate method add(double, double) in type OverloadedMethodsTutorial

    static double add(double a, double b, double c) {
        return a + b + c;
    }

    static double add(double a, double b, double c, double d) {
        return a + b + c + d;
    }

    static String bakePizza(String bread) {
        return bread + " pizza";
    }

    static String bakePizza(String bread, String cheese) {
        return cheese + " " + bread + " pizza";
    }

    static String bakePizza(String bread, String cheese, String topping) {
        return topping + " " + cheese + " " + bread + " pizza";
    }
}
