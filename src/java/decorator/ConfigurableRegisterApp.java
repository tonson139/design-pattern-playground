package src.java.decorator;

import src.java.decorator.registerDecorator.EmailValidatorDecorator;
import src.java.decorator.registerDecorator.PasswordValidatorDecorator;
import src.java.decorator.registerDecorator.UsernameValidatorDecorator;

// https://refactoring.guru/design-patterns/decorator
// https://www.youtube.com/watch?v=v6tpISNjHf8

public class ConfigurableRegisterApp {

    public static void main(String[] args) {
        boolean shouldValidateEmail = true;
        boolean shouldValidateUsername = true;
        boolean shouldValidatePassword = true;

        IRegis register = new Register();
        if (shouldValidateEmail) register = new EmailValidatorDecorator(register);
        if (shouldValidateUsername) register = new UsernameValidatorDecorator(register);
        if (shouldValidatePassword) register = new PasswordValidatorDecorator(register);

        register.regis("supachok@email.com", "supachok1234", "secret1234!");
    }
}
