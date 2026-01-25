package Projects.TemperatureConvertorPackage;

import java.util.Scanner;

public class TemperatureConvertor {
    public static void main(String[] args) {
        
        Scanner userInputScanner = new Scanner(System.in);

        System.out.print("Enter the temperature: ");
        double temperatureInput = userInputScanner.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit (C or F)?: ");
        String unitConversionChoice = userInputScanner.next().toUpperCase();
        // using method chaining to convert the 'unitConversionChoice' string to uppercase

        double convertedTemperature = (unitConversionChoice.equals("C")) ? (temperatureInput - 32) * 5 / 9.0 : (temperatureInput * 9 / 5.0) + 32;
        System.out.printf("The converted temperature: %.2f °%s\n", convertedTemperature, unitConversionChoice);

        userInputScanner.close();

    }
}
