package Tutorials.IfStatements.NestedIfTutorialPackage;

public class NestedIfStatementsTutorial {
    public static void main(String[] args) {
        
        boolean isStudent = false;
        boolean isSenior = false;
        double movieTicketPrice = 9.99;

        if (isStudent) {
            if (isSenior) {
                System.out.println("You get a senior discount of 20% and a student discount of 10%");
                movieTicketPrice *= (1.0 - ((20 + 10 - (20 * 10) / 100) / 100.0));
            }
            else {
                System.out.println("You get a student discount of 10%");
                movieTicketPrice *= 0.9;
            }
        }
        else {
            if (isSenior) {
                System.out.println("You get a senior discount of 20%");
                movieTicketPrice *= 0.8;
            }
            else {
                System.out.println("You get neither a senior nor a student discount");
            }
        }

        System.out.printf("The price of a movie ticket is: USD $%.2f", movieTicketPrice);

    }
}
