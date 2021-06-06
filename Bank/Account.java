package bank;

public class Account {
    private float balance;

    public Account(){
        balance = 0;
    }
    public Account(float balance){
        this.balance = balance;
    }

    public void insertMoney(float amount){
        balance += amount;
    }

    public boolean withdrawMoney(float amount){
        if(balance < amount){
            return false;
        } else{
            balance -= amount;
            return true;
        }
    }
    public float getBalance(){
        return balance;
    }
}
