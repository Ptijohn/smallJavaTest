package Ministere;

/**
 * Generic address class, with street name and number, postal code and city
 */
public class Adresse {
    private String streetName;
    private String codePostal;
    private String ville;

    public Adresse(String streetName, String codePostal, String ville) {
        this.streetName = streetName;
        this.codePostal = codePostal;
        this.ville = ville;
    }
}
