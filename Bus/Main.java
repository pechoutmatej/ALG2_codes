package cz.tul.alg.matpech.oop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int temp = 0;
        Bus a = new Bus(41, 15, "DPMLJ");
        for(int i = 1; i < 5; i++)
        {
            System.out.println(i + ". zastávka");
            System.out.println(a.toString());
            System.out.println("Kolik lidí bude vystupovat a nastupovat?");
            temp = a.exit(sc.nextInt());
            if(temp != 0)
            {
                System.out.println("Nemohlo vystoupit " + temp);
            }

            temp = a.boarding(sc.nextInt());
            if(temp != 0)
            {
                System.out.println("Nemohlo nastoupit " + temp);
            }
        }
        System.out.println("5. zastávka");
        System.out.println(a.toString());
        a.exitAll();
        System.out.println(a.toString());
    }
}
