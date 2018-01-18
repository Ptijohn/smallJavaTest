package Ministere;

/**
 * Entreprise interface, to anticipate future entreprise types
 */
public interface Entreprise {
    /**
     * Computing taxes based on the CA
     * @param ca the ca
     * @return taxes computed
     */
    public double computeTaxes(double ca);
}
