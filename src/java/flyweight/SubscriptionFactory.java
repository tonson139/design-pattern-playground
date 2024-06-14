package src.java.flyweight;

import java.util.HashMap;
import java.util.Map;

public class SubscriptionFactory {
    private Map<String, Subscription> subscriptions = new HashMap<>();

    public Subscription getSubscription(String name) {
        if (subscriptions.containsKey(name)) {
            return subscriptions.get(name);
        }
        var newSubscription = new Subscription(name);
        subscriptions.put(name, newSubscription);
        return newSubscription;
    }

    public int getSubscriptionLength() {
        return subscriptions.size();
    }
}
