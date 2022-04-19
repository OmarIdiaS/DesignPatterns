package PatternObserver;

import PatternObserver.Observable.Observable;
import PatternObserver.Observable.ObservableImpl;
import PatternObserver.Observer.Observer;
import PatternObserver.Observer.ObserverImpl1;
import PatternObserver.Observer.ObserverImpl2;

public class App {
    public static void main(String[] args) {

        Observable observable = new ObservableImpl();

        Observer o1 = new ObserverImpl1();
        Observer o2 = new ObserverImpl2();

        observable.subscribe(o1);
        observable.subscribe(o2);

        ((ObservableImpl) observable).setState(55);

        observable.unsubscribe(o1);

        ((ObservableImpl) observable).setState(33);

        // Subscribe sans implementer de classe.

        observable.subscribe(observable1 -> {
            System.out.println("* Observateur anonyme ======= " +  ((ObservableImpl) observable1).getState() * 125);
        });

        ((ObservableImpl) observable).setState(25);
    }
}
