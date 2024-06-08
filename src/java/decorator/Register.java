package src.java.decorator;

import java.util.ArrayList;
import java.util.List;

public final class Register implements IRegis {
    private List<User> users = new ArrayList<>();


    @Override
    public void regis(String email, String username, String password) {
        User u = new User(email, username, password);
        System.out.println(STR."adding user \{u}");
        users.add(u);
    }
}
