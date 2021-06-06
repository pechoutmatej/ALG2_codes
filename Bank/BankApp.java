package bank;

public class BankApp {
    public static void main(String[] args) {
        Person p = new Person("Person");
        p.addAccount(1000);
        p.addAccount(500);

        System.out.println(p.sumOfBalance());
        p.accounts.get(0).insertMoney(500);
        System.out.println(p.sumOfBalance());
        p.accounts.get(0).withdrawMoney(3000);
        System.out.println(p.sumOfBalance());
    }
}
