package src.java.decorator.registerDecorator;

import src.java.decorator.IRegis;

public abstract class RegisterBaseDecorator implements IRegis {
    protected IRegis wrappee;

    RegisterBaseDecorator(IRegis regis) {
        this.wrappee = regis;
    }
}
