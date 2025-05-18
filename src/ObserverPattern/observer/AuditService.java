package ObserverPattern.observer;

public class AuditService implements UserObserver {

    @Override
    public void update(String userId) {
        System.out.println("Logging audit for " + userId);
    }
}
