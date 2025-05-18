package ObserverPattern.observable;

import ObserverPattern.observer.UserObserver;

public interface UserObservable {
    void add(UserObserver userObserver);
    void remove(UserObserver userObserver);
    void notifyObservers(String userId);
}
