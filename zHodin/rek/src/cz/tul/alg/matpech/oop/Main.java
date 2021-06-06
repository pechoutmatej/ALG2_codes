package cz.tul.alg.matpech.oop;

public class Main {

    public static void main(String[] args) {
	// write your code her
        //System.out.println(mystery(24));
        System.out.println(fibonacci(3));
    }
    /*public static String mystery(int n){
        if(n <= 1){
            return String.valueOf(n);
        }
        return mystery(n / 2) + String.valueOf(n % 2);
    }*/

    public static int mystery(int a, int b) {
        if (b == 0)     return 0;
        if (b % 2 == 0) return mystery(a+a, b/2);
        return mystery(a+a, b/2) + a;
    }

    public static int fibonacci(int a)
    {
        if(a <=1 ) return a;
        else return fibonacci(a-1) + fibonacci(a-2);
    }
}
