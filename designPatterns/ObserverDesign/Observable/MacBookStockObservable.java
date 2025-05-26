package designPatterns.ObserverDesign.Observable;

import designPatterns.ObserverDesignPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class MacBookStockObservable implements StockObservable {
    private final List<NotificationAlertObserver> observers = new ArrayList<>();
    private Integer stock;

    @Override
    public void addSubscriber(NotificationAlertObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeSubscriber(NotificationAlertObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationAlertObserver observer: this.observers) {
            observer.update();
        }
    }

    @Override
    public void setStockCount(Integer count) {
        this.stock = count;
        System.out.println("MacBook stock updated, notifying the subscribers");
        this.notifySubscribers();
    }

    public Integer getStockCount() {
        return this.stock;
    }
}