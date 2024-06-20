package src.java.proxy;

public class User {
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(String sessionId, String username, String password) {
        this.sessionId = sessionId;
        this.username = username;
        this.password = password;
    }

    private String sessionId;
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    @Override
    public String toString() {
        return STR."User{sessionId='\{sessionId}\{'\''}, username='\{username}\{'\''}, password='\{password}\{'\''}\{'}'}";
    }
}
