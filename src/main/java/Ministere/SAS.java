package Ministere;

/**
 * Derived from main enterprise company, with an added address
 */
public class SAS extends AutoEntreprise {
    /**
     * The address of the sas
     */
    protected Adresse adresse;

    /**
     *
     * @param siret siret number
     * @param denomination name of the company
     * @param adresse address of the company
     */
    public SAS(String siret, String denomination, Adresse adresse) {
        super(siret, denomination);
        this.adresse = adresse;
    }

    /**
     * Compute taxes depending on the CA
     * @param ca
     * @return taxes
     */
    public static double computeTaxes(double ca){
        return ca*0.33;
    }

    /**
     *
     * @return address of the company
     */
    public Adresse getAdresse() {
        return adresse;
    }

    /**
     *
     * @param adresse address of the company
     */
    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }
}
