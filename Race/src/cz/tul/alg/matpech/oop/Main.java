package cz.tul.alg.matpech.oop;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Race race = new Race();

        System.out.println("Zadej soubor s registracemi : ");
        String regFile = sc.next();
        System.out.println("Zadej soubor se startem : ");
        String startFile = sc.next();
        System.out.println("Zadej soubor s cílem : ");
        String finishFile = sc.next();
        try {
            race.loadReg(regFile);
            System.out.println(race.printRunners());
            System.out.println(race.getResults());
            race.saveResults(finishFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
