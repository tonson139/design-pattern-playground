package src.java.abstractfactory;

import src.java.abstractfactory.event.Notifier;

public class EmailNotification extends Notification {
    public EmailNotification() {
        this.channel = "EMAIL";
    }

    @Override
    public void send(Notifier notifier) {
        System.out.println(STR."Sending via \{channel} to \{notifier.getMessage()}");
    }
}
