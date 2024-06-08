package src.java.decorator;

public class User {
    private String email;
    private String username;
    private String password;

    User(String email, String username, String password) {
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return STR."User(username: \{username}, email: \{email}, password: \{password})";
    }
}
