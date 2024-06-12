package src.java.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AccountComposite implements IAccount {
    private final List<IAccount> children = new ArrayList<>();

    AccountComposite(IAccount... accounts) {
        this.children.addAll(Arrays.asList(accounts));
    }

    @Override
    public double getBalance() {
        return children.stream().mapToDouble(IAccount::getBalance).sum();
    }

    @Override
    public String printTree(String indent) {
        String tree = "";
        for (IAccount child : children) {
            tree += STR."\{child.printTree(STR."\{indent}--")}";
        }
        return tree;
    }
}
