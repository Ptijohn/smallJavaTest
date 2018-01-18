package Ministere;

/**
 * Main enterprise class, can and will be derived by subclasses
 */
public class AutoEntreprise implements Entreprise {
    /**
     * Siret number of the enterprise, represented as a String in case of zero-starting number
     */
    protected String siret;

    /**
     * Name of the company
     */
    protected String denomination;

    /**
     *
     * @param siret
     * @param denomination
     */
    public AutoEntreprise(String siret, String denomination) {
        this.siret = siret;
        this.denomination = denomination;
    }

    /**
     * Computing taxes based on the CA
     * @param ca the ca
     * @return taxes computed
     */
    public double computeTaxes(double ca){
        return ca*0.25;
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
