package PatternStrategy.JeuDesArmes.Personnage;

import PatternStrategy.JeuDesArmes.ComportementArme.IComportementArme;

public class Personnage {
    String arme;
    IComportementArme comportementArme;

    public void combattre(){
        System.out.println("Arme utilisée : " + arme);
        comportementArme.utliserArme();
    }

    public void setArme(String arme) {
        this.arme = "PatternStrategy.JeuDesArmes.ComportementArme." + arme;
    }
}
