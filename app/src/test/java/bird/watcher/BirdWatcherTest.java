package bird.watcher;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BirdWatcherTest {
    private static BirdWatcher birdCount;

    @Test
    void getLastWeekTest() {
        int[] lastWeek = {0, 2, 5, 3, 7, 8, 4};
        assertArrayEquals(lastWeek, BirdWatcher.getLastWeek());
    }

    @Test
    void getTodayTest() {
        int[] birdsPerDay1 = { 2, 5, 0, 7, 4, 1 };
        birdCount = new BirdWatcher(birdsPerDay1);
        assertEquals(1, birdCount.getToday());

        int[] birdsPerDay2 = { 8, 5, 3, 2, 0, 7 };
        birdCount = new BirdWatcher(birdsPerDay2);
        assertEquals(7, birdCount.getToday());
    }

    @Test
    void incrementTodaysCountTest() {
        int[] birdsPerDay1 = { 2, 5, 0, 7, 4, 1 };
        birdCount = new BirdWatcher(birdsPerDay1);
        birdCount.incrementTodaysCount();
        assertEquals(2, birdCount.getToday());

        birdCount.incrementTodaysCount();
        assertEquals(3, birdCount.getToday());
    }

    @Test
    void hasDayWithoutBirdsTest() {
        int[] birdsPerDay1 = { 2, 5, 0, 7, 4, 1 };
        birdCount = new BirdWatcher(birdsPerDay1);
        assertTrue(birdCount.hasDayWithoutBirds());

        int[] birdsPerDay2 = { 8, 5, 3, 2 };
        birdCount = new BirdWatcher(birdsPerDay2);
        assertFalse(birdCount.hasDayWithoutBirds());
    }

    @Test
    void getCountForFirstDays() {
        int[] birdsPerDay1 = { 2, 5, 0, 7, 4, 1 };
        birdCount = new BirdWatcher(birdsPerDay1);
        assertEquals(14, birdCount.getCountForFirstDays(4));

        int[] birdsPerDay2 = { 8, 5, 3, 2, 0, 7 };
        birdCount = new BirdWatcher(birdsPerDay2);
        assertEquals(8, birdCount.getCountForFirstDays(1));

        int[] birdsPerDay3 = { 3, 2 };
        birdCount = new BirdWatcher(birdsPerDay3);
        assertEquals(0, birdCount.getCountForFirstDays(0));
    }

    @Test
    void getBusyDays() {
        int[] birdsPerDay1 = { 2, 5, 0, 7, 4, 1 };
        birdCount = new BirdWatcher(birdsPerDay1);
        assertEquals(2, birdCount.getBusyDays());

        int[] birdsPerDay2 = { 2, 3, 0, 4, 4, 1 };
        birdCount = new BirdWatcher(birdsPerDay2);
        assertEquals(0, birdCount.getBusyDays());
    }
}