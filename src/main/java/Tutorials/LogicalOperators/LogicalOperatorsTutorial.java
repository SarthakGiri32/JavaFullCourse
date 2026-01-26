package Tutorials.LogicalOperators;

public class LogicalOperatorsTutorial {
    public static void main(String[] args) {
        
        // 1. &&: Logical AND operator

        double temp = 29.99;
        boolean isSunny = true;

        // all conditions linked by the '&&' operator have to be true
        if (temp <= 30 && temp >= 0 && isSunny) {
            System.out.println("The weather is pleasant 😃");
            System.out.println("It is sunny outside ☀️");
        }

    }
}
