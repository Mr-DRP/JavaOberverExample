import java.util.ArrayList;
import java.util.List;

public class SubscribeNotificaton {
    List<Users> subscribers = new ArrayList<>();

    /** add subscriber */
    public void subscribe(Users subscriber) {
        subscribers.add(subscriber);
    }

    /** remove subscriber */
    public void unsubscribe(Users subscriber) {
        subscribers.remove(subscriber);
    }

    /** notify each subscribers */
    public void notifyUsers(String planName) {
        for (Users subscriber : subscribers) {
            subscriber.update(planName);
        }
    }
}
