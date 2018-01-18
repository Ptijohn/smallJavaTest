package Ministere;

public class EntrepriseMaker {
    private AutoEntreprise autoEntreprise;
    private SAS sas;

    public EntrepriseMaker(String siret, String denomination){
        autoEntreprise = new AutoEntreprise(siret, denomination);
        sas = new SAS(siret, denomination);
    }

    public EntrepriseMaker(String siret, String denomination, Adresse adresse){
        this(siret, denomination);
        sas.setAdresse(adresse);
    }

    public double computeAutoEntrepriseTaxes(double ca){
        return autoEntreprise.computeTaxes(ca);
    }

    public double computeSasTaxes(double ca){
        return sas.computeTaxes(ca);
    }
}
