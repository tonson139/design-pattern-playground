package src.java.decorator.registerDecorator;

import src.java.decorator.IRegis;

public class UsernameValidatorDecorator extends RegisterBaseDecorator {
    public UsernameValidatorDecorator(IRegis regis) {
        super(regis);
    }

    @Override
    public void regis(String email, String username, String password) {
        System.out.println(STR."Validating username \{username}");
        this.wrappee.regis(email, username, password);
    }
}
