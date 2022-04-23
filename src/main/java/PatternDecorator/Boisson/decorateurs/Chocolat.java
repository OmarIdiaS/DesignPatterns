package PatternDecorator.Boisson.decorateurs;

import PatternDecorator.Boisson.boisson.Boisson;

public class Chocolat extends DecoratorIngredient {

    public Chocolat(Boisson boisson){
        super(boisson);
    }

    @Override
    public double cout() {
        return boisson.cout() + 3;
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " avec Chocolat";
    }
}
