package Ministere;

public class Main {
    public static void main(String[] args){
        EntrepriseMaker entrepriseMaker = new EntrepriseMaker("1235", "Toto", new Adresse("7 rue de Paris", "75001", "Paris"));

        System.out.println(entrepriseMaker.computeAutoEntrepriseTaxes(12315));
        System.out.println(entrepriseMaker.computeSasTaxes(20000));

    }
}
