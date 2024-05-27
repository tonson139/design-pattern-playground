package src.java.abstractfactory.event;

public class LogoutNotifier extends Notifier {
    public LogoutNotifier(String channel) {
        super(STR."\{channel} LOGOUT");
    }
}
