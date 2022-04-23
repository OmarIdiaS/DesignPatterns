package PatternDecorator.Dessert.decorateurs;

import PatternDecorator.Dessert.dessert.Dessert;

public class Chocolat extends IngredientDecorateur{

    public Chocolat(Dessert dessert){
        this.dessert = dessert;
    }

    @Override
    public String getDescription() {
        return dessert.getDescription() + " au chocolat ";
    }

    @Override
    public double getPrix() {
        return dessert.getPrix() + 0.5;
    }


}
