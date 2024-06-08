package src.java.decorator.registerDecorator;

import src.java.decorator.IRegis;

public class EmailValidatorDecorator extends RegisterBaseDecorator {
    public EmailValidatorDecorator(IRegis regis) {
        super(regis);
    }

    @Override
    public void regis(String email, String username, String password) {
        System.out.println(STR."Validating email \{email}");
        this.wrappee.regis(email, username, password);
    }
}
