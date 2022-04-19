package PatternStrategy.JeuDesArmes.Personnage;

import PatternStrategy.JeuDesArmes.ComportementArme.ComportementPoignard;

public class Roi extends Personnage{
    public Roi(){
        this.comportementArme = new ComportementPoignard();
    }

    @Override
    public void combattre() {
        System.out.println("Je suis un Roi ......");
        comportementArme.utliserArme();


    }
}
