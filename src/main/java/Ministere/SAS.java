package Ministere;

/**
 * Derived from main enterprise company, with an added address
 */
public class SAS implements Entreprise {
    /**
     * Siret number of the enterprise, represented as a String in case of zero-starting number
     */
    protected String siret;

    /**
     * Name of the company
     */
    protected String denomination;

    /**
     * The address of the sas
     */
    protected Adresse adresse;

    /**
     *
     * @param siret siret number
     * @param denomination name of the company
     */
    public SAS(String siret, String denomination) {
        this.siret = siret;
        this.denomination = denomination;
    }

    /**
     *
     * @param siret siret number
     * @param denomination name of the company
     * @param adresse address of the company
     */
    public SAS(String siret, String denomination, Adresse adresse) {
        this.siret = siret;
        this.denomination = denomination;
        this.adresse = adresse;
    }

    /**
     * Computing taxes based on the CA
     * @param ca the ca
     * @return taxes computed
     */
    public double computeTaxes(double ca){
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

    /**
     *
     * @return siret number
     */
    public String getSiret() {
        return siret;
    }

    /**
     *
     * @param siret siret number
     */
    public void setSiret(String siret) {
        this.siret = siret;
    }

    /**
     *
     * @return name of the company
     */
    public String getDenomination() {
        return denomination;
    }

    /**
     *
     * @param denomination name of the company
     */
    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }
}
