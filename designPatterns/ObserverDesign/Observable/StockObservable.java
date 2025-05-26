package designPatterns.ObserverDesign.Observable;

import designPatterns.ObserverDesign.Observer.NotificationAlertObserver;

public interface StockObservable {
    public void addSubscriber(NotificationAlertObserver observer);

    public void removeSubscriber(NotificationAlertObserver observer);

    public void notifySubscribers();

    public void setStockCount(Integer count);

    public Integer getStockCount();
}