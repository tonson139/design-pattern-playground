package src.java.proxy;

public class AuthLogger implements Authentication {

    private AuthenticationService service;

    public AuthLogger(AuthenticationService service) {
        this.service = service;
    }

    @Override
    public User login(String username, String password) {
        User user = service.login(username, password);
        log(STR."User=\{user} has logged in success");
        return user;
    }

    @Override
    public void logout(String sessionId) throws Exception {
        try {
            service.logout(sessionId);
            log(STR."SessionId=\{sessionId} has logged out success");
        } catch (Exception e) {
            log(STR."SessionId=\{sessionId} has error logout with \{e.getMessage()}");
            throw e;
        }
    }

    private void log(String msg) {
        System.out.println(STR."[AuthLogger] - \{msg}");
    }
}
