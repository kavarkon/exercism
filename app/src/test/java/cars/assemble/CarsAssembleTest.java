package cars.assemble;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarsAssembleTest {

    @Test
    void productionRatePerHourTest() {
        assertEquals(1193.4, CarsAssemble.productionRatePerHour(6));
        assertEquals(0, CarsAssemble.productionRatePerHour(0));
    }

    @Test
    void workingItemsPerMinuteTest() {
        assertEquals(19, CarsAssemble.workingItemsPerMinute(6));
        assertEquals(0, CarsAssemble.workingItemsPerMinute(0));
    }
}