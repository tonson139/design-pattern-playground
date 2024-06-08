package src.java.decorator.registerDecorator;

import src.java.decorator.IRegis;

public class PasswordValidatorDecorator extends RegisterBaseDecorator {
    public PasswordValidatorDecorator(IRegis regis) {
        super(regis);
    }

    @Override
    public void regis(String email, String username, String password) {
        System.out.println(STR."Validating password \{password}");
        this.wrappee.regis(email, username, password);
    }
}
