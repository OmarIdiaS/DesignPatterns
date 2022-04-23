package PatternDecorator.boisson;

public abstract class Boisson {
    String description;

    public abstract double cout();

    public String getDescription() {
        return description;
    }
}
