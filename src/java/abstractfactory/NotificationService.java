package src.java.abstractfactory;

import src.java.abstractfactory.event.LoginNotifier;
import src.java.abstractfactory.event.LogoutNotifier;
import src.java.abstractfactory.event.Notifier;

import java.util.UUID;

public class NotificationService {
    private static final Notification notification = new EmailNotification(); // Change this line to use SMSNotification

    public static void main(String[] args) {
        NotificationService service = new NotificationService();
        UUID userId = UUID.randomUUID();
        System.out.println(STR."Sending login and logout messages to userId = \{userId}");
        service.sendLoginMessage(userId);
        service.sendLogoutMessage(userId);
    }

    void sendLoginMessage(UUID userID) {
        LoginNotifier message = notification.buildLoginMessage(userID);
        send(message);
    }

    void sendLogoutMessage(UUID userID) {
        LogoutNotifier message = notification.buildLogoutMessage(userID);
        send(message);
    }

    void send(Notifier notifier) {
        notifier.send();
    }
}
