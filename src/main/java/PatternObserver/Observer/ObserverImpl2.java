package PatternObserver.Observer;

import PatternObserver.Observable.Observable;
import PatternObserver.Observable.ObservableImpl;

public class ObserverImpl2 implements Observer{
    @Override
    public void update(Observable observable) {
        int state = ((ObservableImpl) observable).getState();
        double res = state * 98;
        System.out.println("**** ObserverImpl1 ********");
        System.out.println("Nouvelle mise à jour : state = " + state);
        System.out.println("Résultat de calcul : "+ res);
    }
}
