package PatternStrategy.JeuDesArmes.ComportementArme;

public class ComportementPoignard implements IComportementArme{
    @Override
    public void utliserArme() {
        System.out.println("Arme avec comportement poignard");
    }
}
