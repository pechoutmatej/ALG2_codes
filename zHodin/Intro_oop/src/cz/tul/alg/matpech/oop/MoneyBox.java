package cz.tul.alg.matpech.oop;

public class MoneyBox {
    private int oneCoin;
    private int twoCoin;
    private String owner;

    public int getOneCoin()
    {
        return oneCoin;
    }

    public int getTwoCoin()
    {
        return twoCoin;
    }

    public String getOwner()
    {
        return owner;
    }

    //bod 1
    public MoneyBox(String name)
    {
        owner = name;
    }

    //bod 2
    public MoneyBox(String name, int oneAmount, int twoAmount)
    {
        owner = name;
        oneCoin = oneAmount;
        twoCoin = twoAmount;
    }

    //bod 3
    public void setOwner(String name)
    {
        owner = name;
    }

    //bod 4
    public int cashAmount()
    {
        return oneCoin + twoCoin*2;
    }

    //bod 5
    public void plusOne()
    {
        oneCoin++;
    }

    //bod 6
    public void plusTwo()
    {
        twoCoin++;
        twoCoin++;
    }

    //bod 7
    public void coinInsert(int oneAmount, int twoAmount)
    {
        oneCoin = oneCoin + oneAmount;
        twoCoin = twoCoin + twoAmount;
    }

    //bod 8
    public String toString()
    {
        return (owner + " má v pokladničce " + cashAmount() + "Kč - " + oneCoin + "x1Kč, " + twoCoin + "x2Kč." );
    }

    //bod 9
    public boolean isItEnough(int price)
    {
        if(price <= (oneCoin + twoCoin*2))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    //bod +
    public void transferAll(MoneyBox acceptant)
    {
        acceptant.oneCoin = acceptant.oneCoin + oneCoin;
        oneCoin = 0;
        acceptant.twoCoin = acceptant.twoCoin + twoCoin;
        twoCoin = 0;
    }

    public void withdrawAll() //pouze vymazání
    {
        oneCoin = 0;
        twoCoin = 0;
    }
    public int withdrawAllInfo() //i s počtem peněz
    {
        int result =  cashAmount();
        withdrawAll();
        return result;
    }

    public void insertOnes(int amount)
    {
        oneCoin = oneCoin + amount;
    }
}
