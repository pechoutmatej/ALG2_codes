package bank;

import java.util.ArrayList;
import java.util.List;

public abstract class Client {
    //data
    protected String name;
    protected List<Account> accounts = new ArrayList<>();

    //methods
    public void addAccount(float sum){
        Account acc = new Account(sum);
        accounts.add(acc);
    }

    public float sumOfBalance(){
        float sumOfBalances = 0;
        for (Account acc: accounts) {
            sumOfBalances +=  acc.getBalance();
        }
        return sumOfBalances;
    }

    public abstract String clientName();
}
