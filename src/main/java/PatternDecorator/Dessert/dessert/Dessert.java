package PatternDecorator.Dessert.dessert;

public abstract class Dessert {
    private String description;
    private double prix;

    public String getDescription() {
        return description;
    }

    public double getPrix() {
        return prix;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}
