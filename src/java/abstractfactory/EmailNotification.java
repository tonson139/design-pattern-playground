package src.java.abstractfactory;

public class EmailNotification extends Notification {
    public EmailNotification() {
        this.channel = "EMAIL";
    }
}
