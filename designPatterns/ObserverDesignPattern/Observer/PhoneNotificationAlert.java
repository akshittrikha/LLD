package designPatterns.ObserverDesignPattern.Observer;

import designPatterns.ObserverDesignPattern.Observable.StockObservable;

public class PhoneNotificationAlert implements NotificationAlertObserver {
    private final String phone;
    private final StockObservable observable;

    public PhoneNotificationAlert(String phone, StockObservable observable) {
        this.phone = phone;
        this.observable = observable;
    }

    @Override
    public void update() {
        System.out.println("event captured in " + observable.getClass());
        System.out.println("msg sent to " + phone);
    }
}