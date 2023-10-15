package annalyn.s.infiltration;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnnalynsInfiltrationTest {

    @Test
    void canFastAttackTest() {
        assertFalse(AnnalynsInfiltration.canFastAttack(true));
        assertTrue(AnnalynsInfiltration.canFastAttack(false));
    }

    @Test
    void canSpyTest() {
        assertTrue(AnnalynsInfiltration.canSpy(false, true, false));
        assertTrue(AnnalynsInfiltration.canSpy(false, false, true));
        assertTrue(AnnalynsInfiltration.canSpy(true, false, false));
        assertTrue(AnnalynsInfiltration.canSpy(false, true, true));
        assertTrue(AnnalynsInfiltration.canSpy(true, true, false));
        assertTrue(AnnalynsInfiltration.canSpy(true, false, true));
        assertTrue(AnnalynsInfiltration.canSpy(true, true, true));
    }
    @Test
    void canNotSpyTest() {
        assertFalse(AnnalynsInfiltration.canSpy(false, false, false));
    }

    @Test
    void canSignalPrisonerTest() {
        assertTrue(AnnalynsInfiltration.canSignalPrisoner(false, true));

        assertFalse(AnnalynsInfiltration.canSignalPrisoner(true, false));
        assertFalse(AnnalynsInfiltration.canSignalPrisoner(true, true));
        assertFalse(AnnalynsInfiltration.canSignalPrisoner(false, false));
    }

    @Test
    void canFreePrisonerTest() {
        assertTrue(AnnalynsInfiltration.canFreePrisoner(false, false, true, true));
        assertTrue(AnnalynsInfiltration.canFreePrisoner(true, false, false, true));
        assertTrue(AnnalynsInfiltration.canFreePrisoner(true, false, true, true));
        assertTrue(AnnalynsInfiltration.canFreePrisoner(false, false, false, true));

        assertTrue(AnnalynsInfiltration.canFreePrisoner(false, false, true, false));
    }
    @Test
    void canNotFreePrisonerTest() {
        assertFalse(AnnalynsInfiltration.canFreePrisoner(true, true, true, true));
        assertFalse(AnnalynsInfiltration.canFreePrisoner(true, true, false, true));
        assertFalse(AnnalynsInfiltration.canFreePrisoner(false, true, true, true));
        assertFalse(AnnalynsInfiltration.canFreePrisoner(false, true, false, true));

        assertFalse(AnnalynsInfiltration.canFreePrisoner(false, true, true, false));
        assertFalse(AnnalynsInfiltration.canFreePrisoner(true, false, true, false));
        assertFalse(AnnalynsInfiltration.canFreePrisoner(true, true, true, false));

        assertFalse(AnnalynsInfiltration.canFreePrisoner(false, false, false, false));
        assertFalse(AnnalynsInfiltration.canFreePrisoner(false, true, false, false));
        assertFalse(AnnalynsInfiltration.canFreePrisoner(true, false, false, false));
        assertFalse(AnnalynsInfiltration.canFreePrisoner(true, true, false, false));
    }
}