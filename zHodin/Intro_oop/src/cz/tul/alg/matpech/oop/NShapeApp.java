package cz.tul.alg.matpech.oop;

import java.util.Scanner;

public class NShapeApp {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Zadej úpčet bodů :");
        int n = sc.nextInt();
        /*Point[] array = new Point[n];
        System.out.println("Zadej souřadnice");
        Point p;
        double x,y;
        for (int i = 0; i < n; i++){
            x = sc.nextDouble();
            y = sc.nextDouble();
            p = new Point(x,y);
            array[i] = p;
        }
        NShape shape = new NShape(array);*/
        double[][] array = new double[n][2];
        System.out.println("Zadej souřadnice");
        Point p;
        double x,y;
        for (int i = 0; i < n; i++){
            x = sc.nextDouble();
            y = sc.nextDouble();
            p = new Point(x,y);
            array[i][0] = x;
            array[i][1] = y;
        }
        NShape shape = new NShape(array);
        System.out.println("Obvod" + shape.perim());
    }
}
