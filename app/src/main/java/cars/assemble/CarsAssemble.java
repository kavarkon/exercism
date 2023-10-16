package cars.assemble;

import java.util.Map;

public class CarsAssemble {
    public static void main(String[] args) {
        productionRatePerHour(0);
    }

    private static final int NUMBER_OF_CARS_IN_SOME_SPEED = 221;
    private static final Map<Integer, Double> SUCCESS_RATES = Map.ofEntries(
            Map.entry(0, 0.1),
            Map.entry(1, 1.0),
            Map.entry(2, 1.0),
            Map.entry(3, 1.0),
            Map.entry(4, 1.0),
            Map.entry(5, 0.9),
            Map.entry(6, 0.9),
            Map.entry(7, 0.9),
            Map.entry(8, 0.9),
            Map.entry(9, 0.8),
            Map.entry(10, 0.77));


    public static double productionRatePerHour(int speed) {
        return speed * NUMBER_OF_CARS_IN_SOME_SPEED * SUCCESS_RATES.get(speed);
    }

    public static int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed) / 60);
    }
}
