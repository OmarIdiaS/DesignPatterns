package PatternDecorator.Dessert.decorateurs;

import PatternDecorator.Dessert.dessert.Dessert;

public class Chantilly extends IngredientDecorateur{
    public Chantilly(Dessert dessert){
        this.dessert = dessert;
    }

    @Override
    public String getDescription() {
        return dessert.getDescription() + " au chantilly ";
    }

    @Override
    public double getPrix() {
        return dessert.getPrix() + 0.3;
    }
}
