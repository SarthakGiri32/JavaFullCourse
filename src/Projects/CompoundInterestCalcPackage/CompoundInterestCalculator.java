package Projects.CompoundInterestCalcPackage;

import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {

        // Compound Interest Calculator

        Scanner userInputScanner = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principalAmount = userInputScanner.nextDouble();
        
        System.out.print("Enter the rate of interest (in %): ");
        double interestRate = userInputScanner.nextDouble();

        System.out.print("Enter the compounding period: ");
        int compoundingPeriod = userInputScanner.nextInt();

        System.out.print("Enter the interest duration (in years): ");
        int interestDuration = userInputScanner.nextInt();

        interestRate = interestRate / 100;

        double finalAmount = principalAmount * Math.pow((1 + interestRate / compoundingPeriod), compoundingPeriod * interestDuration);

        System.out.printf("The Final Amount after %d years: USD $%.2f", interestDuration, finalAmount);

        userInputScanner.close();
    }
}
