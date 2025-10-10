package Ideas.RandomThoughts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class LightSpeedTravelCalculator {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a light year value (with or without fractional part):");
        double inputLightYear = Double.parseDouble(bufferedReader.readLine());

        double lightYearToKilometers = inputLightYear * 300000 * 60 * 60 * 24 * 365.25;

        System.out.println("For the input light year value " + inputLightYear + ", the equivalent distance in kilometers is " + lightYearToKilometers);
        System.out.println("For the input light year value " + inputLightYear + ", the equivalent distance in kilometers is " + BigDecimal.valueOf(lightYearToKilometers));
    }
}
