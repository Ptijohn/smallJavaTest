package Ministere;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutoEntrepriseTest {

    @Test
    void computeTaxes() {
        // Perform basic verification of taxes computation
        assertEquals(250, AutoEntreprise.computeTaxes(1000));
        assertEquals(0, AutoEntreprise.computeTaxes(0));
        assertEquals(25, AutoEntreprise.computeTaxes(100));
    }
}