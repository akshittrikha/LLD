package designPatterns.ObserverDesignPattern.Observer;

import designPatterns.ObserverDesignPattern.Observable.StockObservable;

public class EmailNotificationAlert implements NotificationAlertObserver {
    private final String email;
    private final StockObservable observable;

    public EmailNotificationAlert(String email, StockObservable observable) {
        this.email = email;
        this.observable = observable;
    }

    @Override
    public void update() {
        System.out.println("event captured in " + observable.getClass());
        System.out.println("email sent to: " + email);
    }
}