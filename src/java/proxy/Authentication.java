package src.java.proxy;

public interface Authentication {
    User login(String username, String password);

    void logout(String sessionId) throws Exception;
}
