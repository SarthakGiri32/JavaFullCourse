package Ideas.RandomThoughts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LightSpeedTravelCalculator {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a light year value (with or without fractional part):");
        double inputLightYear = Double.parseDouble(bufferedReader.readLine());

        double lightYearToKilometers = inputLightYear * (299792458 / 1000.0) * 60 * 60 * 24 * 365.25;
        String lightYearToKilometersString = String.valueOf(lightYearToKilometers);
//        System.out.println("lightYearToKilometersString = " + lightYearToKilometersString);
        String lightYearFractionalPart = lightYearToKilometersString.substring(0, lightYearToKilometersString.indexOf('E'));
        int lightYearOrderOfMagnitude = Integer.parseInt(lightYearToKilometersString.substring(lightYearToKilometersString.indexOf('E') + 1));
        int decimalPointIndex = lightYearFractionalPart.indexOf('.');
        String lightYearFractionalPartWithoutFloatingPoint = lightYearFractionalPart.substring(0, decimalPointIndex) + lightYearFractionalPart.substring(decimalPointIndex + 1);
        final String lightYearWithMoneyDenomination = convertingScientificNotationToMoneyDenomination(lightYearOrderOfMagnitude, lightYearFractionalPartWithoutFloatingPoint, decimalPointIndex);
        System.out.println(inputLightYear + " Light Years is equivalent to " + lightYearWithMoneyDenomination + " KM");
    }

    private static String convertingScientificNotationToMoneyDenomination(int lightYearOrderOfMagnitude, String lightYearFractionalPartWithoutFloatingPoint, int decimalPointIndex) {
        String lightYearAfterMultiplyingOrderOfMagnitude;
        if (lightYearOrderOfMagnitude < lightYearFractionalPartWithoutFloatingPoint.length() - decimalPointIndex) {
            lightYearAfterMultiplyingOrderOfMagnitude = lightYearFractionalPartWithoutFloatingPoint.substring(0, lightYearOrderOfMagnitude + decimalPointIndex) + '.' + lightYearFractionalPartWithoutFloatingPoint.substring(lightYearOrderOfMagnitude + decimalPointIndex);
        }
        else if (lightYearOrderOfMagnitude == lightYearFractionalPartWithoutFloatingPoint.length() - decimalPointIndex) {
            lightYearAfterMultiplyingOrderOfMagnitude = lightYearFractionalPartWithoutFloatingPoint;
        }
        else {
            lightYearAfterMultiplyingOrderOfMagnitude = lightYearFractionalPartWithoutFloatingPoint + "0".repeat(lightYearOrderOfMagnitude - (lightYearFractionalPartWithoutFloatingPoint.length() - decimalPointIndex));
        }
        final StringBuilder lightYearKMWithCommas = getLightYearWithCommas(lightYearAfterMultiplyingOrderOfMagnitude, lightYearOrderOfMagnitude, decimalPointIndex);
        return lightYearKMWithCommas.toString();
    }

    private static StringBuilder getLightYearWithCommas(String lightYearAfterMultiplyingOrderOfMagnitude, int orderOfMagnitude, int floatingPointIndex) {
        StringBuilder lightYearKMWithCommas = new StringBuilder();
        int k = 1, lightYearLength = lightYearAfterMultiplyingOrderOfMagnitude.length();
        if (lightYearAfterMultiplyingOrderOfMagnitude.contains(".")) {
            lightYearLength = orderOfMagnitude + floatingPointIndex;
            lightYearKMWithCommas.append(lightYearAfterMultiplyingOrderOfMagnitude.substring(lightYearLength));
        }
        for (int i = lightYearLength - 1; i >= 0; i--) {
            if (k == 3){
                lightYearKMWithCommas.insert(0, "," + lightYearAfterMultiplyingOrderOfMagnitude.charAt(i));
                k = 1;
            }
            else {
                lightYearKMWithCommas.insert(0, lightYearAfterMultiplyingOrderOfMagnitude.charAt(i));
                k++;
            }
        }
        if (lightYearKMWithCommas.charAt(0) == ',') {
            lightYearKMWithCommas.replace(0, 1, "");
        }
        return lightYearKMWithCommas;
    }
}
