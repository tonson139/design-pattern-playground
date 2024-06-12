package src.java.composite;

public class AccountService {
    public static void main(String[] args) {
        var accountsChart = new AccountComposite(
                new Account("A01", 100),
                new AccountComposite(
                        new Account("A02-1", 10),
                        new Account("A02-2", 20),
                        new AccountComposite(
                                new Account("A02-3-1", 1),
                                new Account("A02-3-2", 2)
                        )),
                new Account("A05", 200));
        System.out.println(accountsChart.getBalance());
        System.out.println(accountsChart.printTree(""));
    }
}
