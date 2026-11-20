package Ideas.RandomThoughts;

import com.fasterxml.jackson.annotation.JsonProperty;
import tools.jackson.core.JacksonException;
import tools.jackson.core.exc.JacksonIOException;
import tools.jackson.core.exc.StreamReadException;
import tools.jackson.databind.DatabindException;
import tools.jackson.databind.ObjectMapper;

import java.io.File;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class CalculateTimePerHundredMeters {

    private static final Pattern TIME_PATTERN = Pattern.compile("[0-9]:[0-5][0-9]:[0-5][0-9]");
    private static final String DEFAULT_LAP_DATA_FILE_NAME = "SplitDataExample.json";

    private final DistanceAndTimeData allLapData;

    private CalculateTimePerHundredMeters() throws JacksonException {
        this(DEFAULT_LAP_DATA_FILE_NAME);
    }

    private CalculateTimePerHundredMeters(String lapDataFileName) throws JacksonException {
        try {
            allLapData = getLapDataObjectMapper(lapDataFileName);
        } catch (DatabindException e) {
            System.out.println("Invalid JSON structure:\n" + e.getMessage());
            throw e;
        } catch (StreamReadException e) {
            System.out.println("Malformed JSON:\n" + e.getMessage());
            throw e;
        } catch (JacksonIOException e) {
            System.out.println("Could not read file: \"" + lapDataFileName + "\":\n" + e.getMessage());
            throw e;
        }
    }

    private List<Float> getSplitDistanceArray() {
        return allLapData.getSplitDistanceArray();
    }

    private List<String> getSplitTimeArray() {
        return allLapData.getSplitTimeArray();
    }

    /**
     * Creates an ObjectMapper object, read lap data from an input JSON file, and return
     * a DistanceAndTimeData object containing the split time and distance data lists
     * (Create a 'resources' folder inside the 'src/main' directory to store that JSON file)
     * @param lapDataFileName lap time JSON data file name (with file extension)
     * @return DistanceAndTimeData object containing the split time and distance data lists
     */
    private static DistanceAndTimeData getLapDataObjectMapper(String lapDataFileName) {
        if (lapDataFileName == null) {
            throw new IllegalArgumentException("lap time data file name is null");
        }
        if (!lapDataFileName.endsWith(".json")) {
            throw new IllegalArgumentException("Invalid lap time data file type: " + lapDataFileName);
        }
        return new ObjectMapper().readValue(
                new File("src/main/resources/" + lapDataFileName),
                DistanceAndTimeData.class);
    }

    private static class DistanceAndTimeData {
        private List<Float> splitDistanceArray;
        private List<String> splitTimeArray;

        private DistanceAndTimeData() {}

        @JsonProperty("splitDistanceArray")
        private List<Float> getSplitDistanceArray() {
            return splitDistanceArray;
        }

        @JsonProperty("splitDistanceArray")
        private void setSplitDistanceArray(List<Float> splitDistanceArray) {
            this.splitDistanceArray = splitDistanceArray;
        }

        @JsonProperty("splitTimeArray")
        private List<String> getSplitTimeArray() {
            return splitTimeArray;
        }

        @JsonProperty("splitTimeArray")
        private void setSplitTimeArray(List<String> splitTimeArray) {
            this.splitTimeArray = splitTimeArray;
        }
    }

    public static void main(String[] args) {

        CalculateTimePerHundredMeters calculateTimePerHundredMeters = new CalculateTimePerHundredMeters();

        List<BigDecimal> splitTimePerHundredMeters = new ArrayList<>();

        List<Float> splitDistanceList = calculateTimePerHundredMeters.getSplitDistanceArray();
        List<String> splitTimeList = calculateTimePerHundredMeters.getSplitTimeArray();

        if (splitDistanceList.size() == splitTimeList.size()) {
            for (int i = 0; i < splitDistanceList.size(); i++) {
                if (!TIME_PATTERN.matcher(splitTimeList.get(i)).matches()) {
                    throw new IllegalArgumentException("Time must be H:MM:SS (hours 0-9), got \"" +
                                                        splitTimeList.get(i) + "\"");
                }
                String[] hoursMinutesSeconds = splitTimeList.get(i).split(":");
                int splitTimeInSeconds = Integer.parseInt(hoursMinutesSeconds[1]) * 60 +
                        Integer.parseInt(hoursMinutesSeconds[2]);

                BigDecimal hundredMeterLapCount = getHundredMeterLapCount(splitDistanceList.get(i));

                splitTimePerHundredMeters.add(new BigDecimal(splitTimeInSeconds).divide(hundredMeterLapCount,
                        3, RoundingMode.HALF_UP));
            }

            for (BigDecimal singleHundredMeterTime : splitTimePerHundredMeters) {
                System.out.println(singleHundredMeterTime);
            }
        } else {
            throw new RuntimeException("Error: Size mismatch between the split distance and split time arrays");
        }
    }

    private static BigDecimal getHundredMeterLapCount(Float lapKilometers) {
        if (lapKilometers == null) {
            throw new IllegalArgumentException("lap distance is null");
        }
        if (!Float.isFinite(lapKilometers)) {
            throw new IllegalArgumentException("lap distance is not finite: " + lapKilometers);
        }
        if (lapKilometers < 0) {
            throw new IllegalArgumentException("lap distance is negative: " + lapKilometers);
        }
        return new BigDecimal(lapKilometers.toString()).multiply(BigDecimal.TEN);
    }
}
