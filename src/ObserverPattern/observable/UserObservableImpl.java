package ObserverPattern.observable;

import ObserverPattern.observer.UserObserver;

import java.util.*;

public class UserObservableImpl implements UserObservable {

    List<UserObserver> observers;

    public UserObservableImpl() {
        this.observers = new ArrayList<UserObserver>();
    }

    @Override
    public void add(UserObserver userObserver) {
        this.observers.add(userObserver);
    }

    @Override
    public void remove(UserObserver userObserver) {
        this.observers.remove(userObserver);
    }

    @Override
    public void notifyObservers(String userId) {
        for (UserObserver userObserver : observers) {
            userObserver.update(userId);
        }
    }

    public void updateUserProfile(String userId) {
        this.notifyObservers(userId);
    }
}
