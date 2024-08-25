package src.java.chainofresponsiblitity;

public class RequestBodyFilter implements Activatable {
    @Override
    public boolean canActive(Request request) {
        System.out.println("[3/3] RequestBodyFilter");
        return "PASS".equals(request.body());
    }
}
