package cz.tul.alg.matpech.oop;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //krok 1
        MoneyBox Alice = new MoneyBox("Alice", 5, 7);
        //krok 2
        MoneyBox Bob = new MoneyBox("Bob");
        //krok 3
        Bob.plusOne();
        Bob.plusOne();
        Bob.plusTwo();
        Bob.plusTwo();
        Bob.plusTwo();
        Bob.coinInsert(5,10);
        //krok 4
        System.out.println(Alice.cashAmount());
        System.out.println(Bob.cashAmount());
        //krok 5
        System.out.println(Alice.toString());
        System.out.println(Bob.toString());
        //krok 6
        System.out.println(Alice.isItEnough(39));
        System.out.println(Bob.isItEnough(39));
        //krok 7
        if(Bob.cashAmount() > Alice.cashAmount())
        {
            System.out.println("Bob má více peněz než Alice");
        }
        else
        {
            System.out.println("Alice má více peněz než Bob");
        }
        //krok 8
        Bob.transferAll(Alice);
        System.out.println(Alice.toString());
        System.out.println(Bob.toString());
        System.out.println(Bob.withdrawAllInfo());

    }
}
