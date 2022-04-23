package PatternDecorator.Boisson.decorateurs;

import PatternDecorator.Boisson.boisson.Boisson;

public abstract class DecoratorIngredient extends Boisson {
    protected Boisson boisson; // Composition

    public DecoratorIngredient(Boisson boisson){
        super();
        this.boisson = boisson;
    }

    public abstract String getDescription();

}
