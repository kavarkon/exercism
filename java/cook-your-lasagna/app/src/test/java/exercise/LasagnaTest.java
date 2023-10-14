package exercise;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LasagnaTest {
    private static final Lasagna lasagna = new Lasagna();

    @Test
    public void expectedMinutesInOvenTest() {
        assertEquals(40, lasagna.expectedMinutesInOven());
    }

    @Test
    void remainingMinutesInOvenTest() {
        assertEquals(10, lasagna.remainingMinutesInOven(30));
        assertEquals(0, lasagna.remainingMinutesInOven(40));
        assertEquals(40, lasagna.remainingMinutesInOven(0));
    }

    @Test
    public void preparationTimeInMinutesTest() {
        assertEquals(4, lasagna.preparationTimeInMinutes(2));
        assertEquals(6, lasagna.preparationTimeInMinutes(3));
    }

    @Test
    void totalTimeInMinutesTest() {
        assertEquals(26, lasagna.totalTimeInMinutes(3, 20));
        assertEquals(0, lasagna.totalTimeInMinutes(0, 0));
        assertEquals(48, lasagna.totalTimeInMinutes(4, 40));
    }
}
