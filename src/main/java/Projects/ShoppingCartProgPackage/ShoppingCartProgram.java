package Projects.ShoppingCartProgPackage;

import java.util.Scanner;

public class ShoppingCartProgram {
    public static void main(String[] args) {

        // Shopping Cart Program
        Scanner userInput = new Scanner(System.in);

        String itemName;
        float itemPrice;
        int itemQuantity;
        char currencyUnit = '$';
        float totalBill;

        System.out.print("What item would you like to buy?: ");
        itemName = userInput.nextLine();

        System.out.print("What is the price for each?: ");
        itemPrice = userInput.nextFloat();

        System.out.print("How many would you like?: ");
        itemQuantity = userInput.nextInt();

        totalBill = itemPrice * itemQuantity;

        System.out.println("\nYou have bought " + itemQuantity + " " + itemName + "/s");
        System.out.println("Your total is " + currencyUnit + totalBill);

        userInput.close();

    }

}
