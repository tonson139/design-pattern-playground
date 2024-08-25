package src.java.chainofresponsiblitity;

public class RequestMethodFilter implements Activatable {
    @Override
    public boolean canActive(Request request) {
        System.out.println("[1/3] RequestMethodFilter");
        return "PASS".equals(request.method());
    }
}
