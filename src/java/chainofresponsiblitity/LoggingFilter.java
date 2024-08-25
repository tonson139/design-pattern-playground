package src.java.chainofresponsiblitity;

public class LoggingFilter implements Activatable {
    @Override
    public boolean canActive(Request request) {
        System.out.println(STR."[0/0] LoggingFilter \{request.toString()}");
        return true;
    }
}
