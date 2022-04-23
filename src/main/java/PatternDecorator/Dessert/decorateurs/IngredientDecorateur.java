package PatternDecorator.Dessert.decorateurs;

import PatternDecorator.Dessert.dessert.Dessert;

public abstract class IngredientDecorateur extends Dessert{
    protected Dessert dessert;

    public abstract String getDescription();

    public abstract double getPrix();
}
