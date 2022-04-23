package PatternDecorator;

import PatternDecorator.boisson.Boisson;
import PatternDecorator.boisson.Mocka;
import PatternDecorator.decorateurs.Chocolat;
import PatternDecorator.decorateurs.Lait;

public class BoissonApp {
    public static void main(String[] args) {

        Boisson mocka = new Mocka();

        System.out.println("===============================");
        System.out.println("Boisson " + mocka.getDescription());
        System.out.println("Boisson " + mocka.cout() + " €");
        System.out.println("===============================");

        Boisson mockaAuLait = new Lait(mocka);

        System.out.println("===============================");
        System.out.println("Boisson " + mockaAuLait.getDescription());
        System.out.println("Boisson " + mockaAuLait.cout() + " €");
        System.out.println("===============================");

        Boisson mockaAuLaitAuChocolat = new Chocolat(mockaAuLait);

        System.out.println("===============================");
        System.out.println("Boisson " + mockaAuLaitAuChocolat.getDescription());
        System.out.println("Boisson " + mockaAuLaitAuChocolat.cout() + " €");
        System.out.println("===============================");
    }
}
