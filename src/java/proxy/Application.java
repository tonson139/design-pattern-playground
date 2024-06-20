package src.java.proxy;

public class Application {

    public static void main(String[] args) {
        Authentication service = new AuthLogger(new AuthenticationService());
        // should success
        User user = service.login("tonson", "1234");
        try {
            service.logout(user.getSessionId());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        // should fail
        try {
            service.logout("No have !!");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
