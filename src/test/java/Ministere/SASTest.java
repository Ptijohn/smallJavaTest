package Ministere;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SASTest {

    @Test
    void computeTaxes() {
        // Perform basic verification of taxes computation
        assertEquals(330, SAS.computeTaxes(1000));
        assertEquals(0, SAS.computeTaxes(0));
        assertEquals(33, SAS.computeTaxes(100));
    }
}