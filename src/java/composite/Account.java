package src.java.composite;

public class Account implements IAccount {
    private String accountName;
    private double balance;

    Account(String accountName, double balance) {
        this.accountName = accountName;
        this.balance = balance;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String printTree(String indent) {
        return STR."\{indent}\{accountName}\n";
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
