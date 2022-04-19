package PatternStrategy.JeuDesArmes;

import PatternStrategy.JeuDesArmes.Personnage.Personnage;
import PatternStrategy.JeuDesArmes.Personnage.Reine;
import PatternStrategy.JeuDesArmes.Personnage.Roi;

public class App {
    public static void main(String[] args) {

        Personnage reine=new Reine();
        reine.combattre();
        System.out.println(" ----------------------------- ");
        Personnage roi=new Roi();
        roi.combattre();
    }
}
