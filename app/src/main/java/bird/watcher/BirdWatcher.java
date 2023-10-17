package bird.watcher;

import java.util.stream.IntStream;

public class BirdWatcher {
    private static final int[] LAST_WEEK = {0, 2, 5, 3, 7, 8, 4};
    private static final int BUSY_DAY = 5;
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        return LAST_WEEK.clone();
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[birdsPerDay.length - 1] += 1;
    }

    public boolean hasDayWithoutBirds() {
        return IntStream.of(birdsPerDay).anyMatch(day -> day == 0);
    }

    public int getCountForFirstDays(int numberOfDays) {
        return IntStream.of(birdsPerDay).limit(numberOfDays).sum();
    }

    public int getBusyDays() {
        return (int) IntStream.of(birdsPerDay).filter(day -> day >= BUSY_DAY).count();
    }
}
