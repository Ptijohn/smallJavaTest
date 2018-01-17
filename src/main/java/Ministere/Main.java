package Ministere;

public class Main {
    public static void main(String[] args){
        SAS sas = new SAS("12414", "Toto",new Adresse("7 rue des toto", "75001", "Paris"));
        AutoEntreprise aut = new AutoEntreprise("123115151", "Titi");
        System.out.println(sas.getDenomination()+" taxes are : "+sas.computeTaxes(1000));
        System.out.println(aut.getDenomination()+" taxes are : "+aut.computeTaxes(1000));
    }
}
