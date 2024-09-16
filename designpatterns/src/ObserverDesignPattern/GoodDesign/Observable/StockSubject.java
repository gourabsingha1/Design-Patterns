package ObserverDesignPattern.GoodDesign.Observable;

import ObserverDesignPattern.GoodDesign.Observer.Observer;

public interface StockSubject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}