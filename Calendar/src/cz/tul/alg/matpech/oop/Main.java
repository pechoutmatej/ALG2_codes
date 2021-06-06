package cz.tul.alg.matpech.oop;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Calendar a = new Calendar(8,5,2021);
        a.makeTable();
        System.out.println("Dnes je " + a.getDay() + ". " + a.getMonth() + ". " + a.getYear());
        System.out.println(a.toString());
        Calendar b = new Calendar(1, a.getMonth()+1, a.getYear());
        System.out.println(b.toString());
    }
}
