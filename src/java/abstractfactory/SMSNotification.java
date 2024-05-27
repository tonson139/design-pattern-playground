package src.java.abstractfactory;

import src.java.abstractfactory.event.Notifier;

public class SMSNotification extends Notification {
    public SMSNotification() {
        this.channel = "SMS";
    }

    @Override
    public void send(Notifier notifier) {
        System.out.println(STR."Sending via \{channel} to \{notifier.getMessage()}");
    }
}
