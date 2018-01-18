package Ministere;

/**
 * Generic address class, with street name and number, postal code and city
 */
public class Adresse {
    /**
     * Name of the street
     */
    private String streetName;

    /**
     * Postal code
     */
    private String codePostal;

    /**
     * City name
     */
    private String ville;

    /**
     * Builds an Adresse object
     * @param streetName name of the street
     * @param codePostal postal code
     * @param ville city
     */
    public Adresse(String streetName, String codePostal, String ville) {
        this.streetName = streetName;
        this.codePostal = codePostal;
        this.ville = ville;
    }
}
