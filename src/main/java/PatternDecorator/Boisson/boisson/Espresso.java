package PatternDecorator.Boisson.boisson;

public class Espresso extends Boisson {

    public Espresso() {
        this.description = "Espresso";
    }

    @Override
    public double cout(){
        return 12;
    }

}
