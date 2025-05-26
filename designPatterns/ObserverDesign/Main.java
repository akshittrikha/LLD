package designPatterns.ObserverDesign;

import designPatterns.ObserverDesign.Observable.MacBookStockObservable;
import designPatterns.ObserverDesign.Observable.StockObservable;
import designPatterns.ObserverDesign.Observable.iPhoneStockObservable;
import designPatterns.ObserverDesign.Observer.EmailNotificationAlert;
import designPatterns.ObserverDesign.Observer.NotificationAlertObserver;
import designPatterns.ObserverDesign.Observer.PhoneNotificationAlert;

public class Main {
    public static void main(String[] args) {
        StockObservable iPhoneObservable = new iPhoneStockObservable();
        StockObservable macBookObservable = new MacBookStockObservable();

        NotificationAlertObserver observer1 = new EmailNotificationAlert("email1@test.com", iPhoneObservable);
        NotificationAlertObserver observer2 = new EmailNotificationAlert("email2@test.com", iPhoneObservable);
        NotificationAlertObserver observer3 = new PhoneNotificationAlert("7978749040", iPhoneObservable);

        NotificationAlertObserver observer4 = new PhoneNotificationAlert("7978749040", macBookObservable);

        iPhoneObservable.addSubscriber(observer1);
        iPhoneObservable.addSubscriber(observer2);
        iPhoneObservable.addSubscriber(observer3);
        macBookObservable.addSubscriber(observer4);

        iPhoneObservable.setStockCount(10);
        macBookObservable.setStockCount(10);
        iPhoneObservable.setStockCount(10);

    }
}