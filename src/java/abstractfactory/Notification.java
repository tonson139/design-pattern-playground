package src.java.abstractfactory;

import src.java.abstractfactory.event.LoginNotifier;
import src.java.abstractfactory.event.LogoutNotifier;

import java.util.UUID;

public abstract class Notification {
    protected String channel = null;

    public LoginNotifier buildLoginMessage(UUID userID) {
        LoginNotifier notification = new LoginNotifier(channel);
        notification.setRecipient(userID);
        return notification;
    }

    public LogoutNotifier buildLogoutMessage(UUID userID) {
        LogoutNotifier notification = new LogoutNotifier(channel);
        notification.setRecipient(userID);
        return notification;
    }
}
