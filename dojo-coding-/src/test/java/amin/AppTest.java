package amin;

import org.junit.jupiter.api.Test;

import jdk.jfr.Timestamp;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    void testApp() {
        assertEquals(1, 1);
    }

    @Test
    void decode() {
        assertEquals(1, App.decode("I"));
        assertEquals(2, App.decode("II"));
        assertEquals(3, App.decode("III"));
        assertEquals(1440, App.decode("MCDXX+XX"));
    }

    @Test
    void anneeBi(){

        assertEquals(false, App.anneeBi(2100));
        assertEquals(true, App.anneeBi(1928));
        assertEquals(false, App.anneeBi(1700));
        assertEquals(true, App.anneeBi(1804));
        assertEquals(false, App.anneeBi(2043));
        
    }
}
