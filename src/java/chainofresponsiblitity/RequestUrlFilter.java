package src.java.chainofresponsiblitity;

public class RequestUrlFilter implements Activatable {
    @Override
    public boolean canActive(Request request) {
        System.out.println("[2/3] RequestUrlFilter");
        return "PASS".equals(request.url());
    }
}
