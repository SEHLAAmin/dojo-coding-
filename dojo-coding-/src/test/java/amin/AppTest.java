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
    void testLettreRomain() {
        assertEquals("I", App.TestLettreRomain(1));
        assertEquals("II", App.TestLettreRomain(2));
        assertEquals("III", App.TestLettreRomain(3));
    }
}
