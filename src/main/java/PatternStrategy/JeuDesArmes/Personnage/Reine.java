package PatternStrategy.JeuDesArmes.Personnage;

import PatternStrategy.JeuDesArmes.ComportementArme.Comportementhache;

public class Reine extends Personnage{
    public Reine(){
        this.comportementArme = new Comportementhache();
    }

    @Override
    public void combattre() {
        System.out.println("Je suis en Reine ....... ");
        this.comportementArme.utliserArme();
    }
}
