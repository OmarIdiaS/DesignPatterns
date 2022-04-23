package PatternDecorator.decorateurs;

import PatternDecorator.boisson.Boisson;

public class Lait extends DecoratorIngredient {

    public Lait(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return boisson.cout() + 3;
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " avec Lait";
    }
}
