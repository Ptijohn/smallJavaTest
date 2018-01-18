package Ministere;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Auto entreprise test class")
class AutoEntrepriseTest {
    private Entreprise autoEntreprise;

    @BeforeEach
    public void init() throws Exception {
        autoEntreprise = new AutoEntreprise("123", "MyCompany");
    }

    @Test
    void computeTaxes() {
        // Perform basic verification of taxes computation
        assertEquals(250, autoEntreprise.computeTaxes(1000));
        assertEquals(0, autoEntreprise.computeTaxes(0));
        assertEquals(25, autoEntreprise.computeTaxes(100));
    }
}