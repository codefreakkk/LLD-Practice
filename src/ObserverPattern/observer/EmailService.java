package ObserverPattern.observer;

public class EmailService implements UserObserver{

    @Override
    public void update(String userId) {
        System.out.println("Email sent to " + userId);
    }
}
