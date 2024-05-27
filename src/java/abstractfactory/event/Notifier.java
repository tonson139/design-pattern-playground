package src.java.abstractfactory.event;

import java.util.UUID;

public abstract class Notifier {
    protected String eventType;
    protected UUID userId;

    Notifier(String eventType) {
        this.eventType = eventType;
    }

    public void setRecipient(UUID userId) {
        this.userId = userId;
    }

    public void send() {
        System.out.println(STR."Send \{eventType} message to userID=\{userId}");
    }
}
