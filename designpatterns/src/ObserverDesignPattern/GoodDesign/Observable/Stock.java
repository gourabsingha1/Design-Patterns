package ObserverDesignPattern.GoodDesign.Observable;

import ObserverDesignPattern.GoodDesign.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

// Concrete Subject (Stock) Class
public class Stock implements StockSubject {
    private String name;
    private double price;
    private List<Observer> observers;

    public Stock(String name, double price) {
        this.name = name;
        this.price = price;
        this.observers = new ArrayList<>();
    }

    // Register a new observer
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Remove an observer
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Notify all observers when the stock price changes
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(name, price);
        }
    }

    // Update the stock price and notify observers
    public void setPrice(double price) {
        this.price = price;
        notifyObservers();
    }
}