package Ideas.RandomThoughts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class CalculationTimePerHundredMeters {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Float> splitTimePerHundredMeters = new ArrayList<>();
        String enterMoreData;

        do {
            System.out.println("Enter the split distance (in KM):");
            float splitDistance = Float.parseFloat(bufferedReader.readLine());

            System.out.println("Enter the split time (in mm:ss):");
            String splitTime = bufferedReader.readLine();

            int minutes = Integer.parseInt(splitTime.substring(0, splitTime.indexOf(':')));
            int seconds = Integer.parseInt(splitTime.substring(splitTime.indexOf(':') + 1));
            int splitTimeInSeconds = minutes * 60 + seconds;

            BigDecimal roundedUpSplitDistance = new BigDecimal(Float.toString(splitDistance));
            roundedUpSplitDistance = roundedUpSplitDistance.setScale(1, RoundingMode.UP);
            splitDistance = roundedUpSplitDistance.floatValue();
            float hundredMeterCount = splitDistance * 10;

            splitTimePerHundredMeters.add(splitTimeInSeconds / hundredMeterCount);

            System.out.print("Do you want to enter more data? (yes/no): ");
            enterMoreData = bufferedReader.readLine();
        } while (enterMoreData.equalsIgnoreCase("yes"));

        for (float singleHundredMeterTime : splitTimePerHundredMeters) {
            System.out.println(singleHundredMeterTime);
        }
    }
}
