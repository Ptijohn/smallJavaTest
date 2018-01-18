package Ministere;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Test of our facade")
class EntrepriseMakeTest {
    private EntrepriseMaker entrepriseMaker;

    @BeforeEach
    public void init() throws Exception {
        entrepriseMaker = new EntrepriseMaker("123", "MyCompany", new Adresse("7 rue de Paris", "75001", "Paris"));
    }

    @Test
    @DisplayName("Testing the auto entreprise taxes computing")
    void testAutoEntreprise() {
        // Perform basic verification of taxes computation
        assertEquals(250, entrepriseMaker.computeAutoEntrepriseTaxes(1000));
        assertEquals(0, entrepriseMaker.computeAutoEntrepriseTaxes(0));
        assertEquals(25, entrepriseMaker.computeAutoEntrepriseTaxes(100));
    }

    @Test
    @DisplayName("Testing the SAS taxes computing")
    void testSAS() {
        // Perform basic verification of taxes computation
        assertEquals(330, entrepriseMaker.computeSasTaxes(1000));
        assertEquals(0, entrepriseMaker.computeSasTaxes(0));
        assertEquals(33, entrepriseMaker.computeSasTaxes(100));
    }
}