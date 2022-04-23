package PatternDecorator.Dessert;

import PatternDecorator.Dessert.decorateurs.Chantilly;
import PatternDecorator.Dessert.decorateurs.Chocolat;
import PatternDecorator.Dessert.decorateurs.IngredientDecorateur;
import PatternDecorator.Dessert.dessert.Crepe;
import PatternDecorator.Dessert.dessert.Dessert;

public class DessertApp {
    public static void main(String[] args) {
        Dessert crepe = new Crepe();

        Chocolat crepeAuChocolat = new Chocolat(crepe);

        Chantilly crepeAuChocolatEtAuChantilly = new Chantilly(crepeAuChocolat);

        System.out.println("=========================================");
        System.out.println("Dessert : " + crepeAuChocolatEtAuChantilly.getDescription());
        System.out.println("Prix : " + crepeAuChocolatEtAuChantilly.getPrix() + " €");
        System.out.println("=========================================");
    }
}
