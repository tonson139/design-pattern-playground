package src.java.proxy;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class AuthenticationService implements Authentication {

    private List<String> sessionIds = new ArrayList<>();

    public User login(String username, String password) {
        System.out.println(STR."Do some complex login logic for user=\{username} password=\{password}");
        final String sessionId = UUID.randomUUID().toString();
        sessionIds.add(sessionId);
        return new User(sessionId, username, password);
    }

    public void logout(String sessionId) throws Exception {
        System.out.println(STR."Do some complex logout logic for sessionId=\{sessionId}");
        boolean isSuccess = sessionIds.remove(sessionId);
        if (!isSuccess) {
            throw new Exception("Not found sessionId");
        }
    }
}
