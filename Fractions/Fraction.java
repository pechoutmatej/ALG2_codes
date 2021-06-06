package cz.tul.alg.matpech.oop;

public class Fraction {

    private int numerator;

    private int denominator;


    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction (String fraction) {
        String[] array = fraction.split("/");
        if (array.length == 2) {
            this.numerator = Integer.parseInt(array[0]);
            this.denominator = Integer.parseInt(array[1]);

        }

    }

    @Override
    public String toString() {
        if ( this.denominator == this.numerator) {
            return ""+1;
        }
        return numerator + "/" + denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void minimalize () {
        int i = 2;
        while (i <= Math.abs(this.denominator) && i <= Math.abs(this.numerator) ) {
            if (this.denominator % i == 0 && this.numerator % i == 0) {
                this.denominator /= i;
                this.numerator /= i;
            } else {
                i++;
            }
        }
    }
}
