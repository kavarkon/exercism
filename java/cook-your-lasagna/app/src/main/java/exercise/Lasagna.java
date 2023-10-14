package exercise;

public class Lasagna {
    private static final int MINUTES_IN_OVEN = 40;
    private static final int MINUTES_FOR_EACH_LAYER = 2;

    public int expectedMinutesInOven() {
        return MINUTES_IN_OVEN;
    }

    public int remainingMinutesInOven(int actualMinutes) {
        return this.expectedMinutesInOven() - actualMinutes;
    }

    public int preparationTimeInMinutes(int numberOfLayers) {
        return numberOfLayers * MINUTES_FOR_EACH_LAYER;
    }

    public int totalTimeInMinutes(int layersAdded, int actualMinutesInOven) {
        return this.preparationTimeInMinutes(layersAdded) + actualMinutesInOven;
    }
}
