package Ideas.RandomThoughts;

import com.fasterxml.jackson.annotation.JsonProperty;
import tools.jackson.core.JacksonException;
import tools.jackson.databind.ObjectMapper;

import java.io.File;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class CalculateTimePerHundredMeters {

    private final DistanceAndTimeData distanceAndTimeData;

    private CalculateTimePerHundredMeters() throws JacksonException {
        ObjectMapper distanceAndTimeDataObjectMapper = new ObjectMapper();
        distanceAndTimeData = distanceAndTimeDataObjectMapper.readValue(
                new File("src/main/resources/DistanceAndTimeDataExample.json"), DistanceAndTimeData.class);
    }

    private List<Float> getSplitDistanceArray() {
        return distanceAndTimeData.getSplitDistanceArray();
    }

    private List<String> getSplitTimeArray() {
        return distanceAndTimeData.getSplitTimeArray();
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

        List<Float> splitTimePerHundredMeters = new ArrayList<>();

        List<Float> splitDistanceList = calculateTimePerHundredMeters.getSplitDistanceArray();
        List<String> splitTimeList = calculateTimePerHundredMeters.getSplitTimeArray();

        if (splitDistanceList.size() == splitTimeList.size()) {
            for (int i = 0; i < splitDistanceList.size(); i++) {
                String[] hoursMinutesSeconds = splitTimeList.get(i).split(":");
                int splitTimeInSeconds = Integer.parseInt(hoursMinutesSeconds[1]) * 60 +
                        Integer.parseInt(hoursMinutesSeconds[2]);

                BigDecimal roundedUpSplitDistance = new BigDecimal(Float.toString(splitDistanceList.get(i)));
                roundedUpSplitDistance = roundedUpSplitDistance.setScale(1, RoundingMode.HALF_UP);
                float splitDistance = roundedUpSplitDistance.floatValue();
                float hundredMeterCount = splitDistance * 10;

                splitTimePerHundredMeters.add(splitTimeInSeconds / hundredMeterCount);
            }
        } else {
            throw new RuntimeException("Error: Size mismatch between the split distance and split time arrays");
        }

        for (float singleHundredMeterTime : splitTimePerHundredMeters) {
            System.out.println(singleHundredMeterTime);
        }
    }
}
