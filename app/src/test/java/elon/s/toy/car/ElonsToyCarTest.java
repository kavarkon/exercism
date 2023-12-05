package elon.s.toy.car;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElonsToyCarTest {

    @Test
    void buyTest() {
        assertNotNull(ElonsToyCar.buy());
    }

    @Test
    void distanceDisplayTest() {
        assertEquals("Driven 0 meters", ElonsToyCar.buy().distanceDisplay());
    }

    @Test
    void batteryDisplayTest() {
        assertEquals("Battery at 100%" ,ElonsToyCar.buy().batteryDisplay());
    }

    @Test
    void batteryDisplayUpdateTest() {
        ElonsToyCar car = ElonsToyCar.buy();
        car.drive();
        car.drive();
        assertEquals("Battery at 98%" , car.batteryDisplay());
    }

    @Test
    void driveTest() {
        ElonsToyCar car = ElonsToyCar.buy();
        car.drive();
        car.drive();
        assertEquals("Driven 40 meters", car.distanceDisplay());
    }

    @Test
    void driveBatteryDrainedTest() {
        ElonsToyCar car = ElonsToyCar.buy();

        for (int i = 100; i > 0; i--) {
            car.drive();
        }

        assertEquals("Driven 2000 meters", car.distanceDisplay());

        assertEquals("Battery empty", car.batteryDisplay());
    }
}