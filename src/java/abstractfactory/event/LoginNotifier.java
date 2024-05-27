package src.java.abstractfactory.event;

public class LoginNotifier extends Notifier {
    public LoginNotifier(String channel) {
        super(STR."\{channel} LOGIN");
    }
}
