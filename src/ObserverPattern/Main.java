package ObserverPattern;

import ObserverPattern.observable.UserObservableImpl;
import ObserverPattern.observer.AuditService;
import ObserverPattern.observer.EmailService;
import ObserverPattern.observer.UserObserver;

public class Main {
    public static void main(String[] args) {
        UserObservableImpl userObservable = new UserObservableImpl();

        UserObserver observer1 = new EmailService();
        UserObserver observer2 = new AuditService();

        // add observers to list
        userObservable.add(observer1);
        userObservable.add(observer2);

        userObservable.updateUserProfile("12897");
    }
}
