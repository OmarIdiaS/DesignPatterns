package PatternObserver.Observable;


import PatternObserver.Observer.Observer;

public interface Observable {
    public void subscribe(Observer o);
    public void unsubscribe(Observer o);
    public void notifyObservers();
}
