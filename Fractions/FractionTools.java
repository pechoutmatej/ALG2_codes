package cz.tul.alg.matpech.oop;

public class FractionTools {
    private FractionTools () {

    }

    public static Fraction add (Fraction f1, Fraction f2) {
        int numerator;
        int denominator;
        if (f1.getDenominator() == f2.getDenominator()) {
            numerator = f1.getNumerator() + f2.getNumerator();
            denominator = f1.getDenominator();
        } else {
            numerator = f1.getNumerator()*f2.getDenominator() + f1.getDenominator()*f2.getNumerator();
            denominator = f1.getDenominator()*f2.getDenominator();
        }
        Fraction ret = new Fraction(numerator,denominator);
        ret.minimalize();
        return ret;
    }


    public static Fraction sub (Fraction f1, Fraction f2) {
        int numerator;
        int denominator;
        if (f1.getDenominator() == f2.getDenominator()) {
            numerator = f1.getNumerator() - f2.getNumerator();
            denominator = f1.getDenominator();
        } else {
            numerator = f1.getNumerator()*f2.getDenominator() - f1.getDenominator()*f2.getNumerator();
            denominator = f1.getDenominator()*f2.getDenominator();
        }

        Fraction ret = new Fraction(numerator,denominator);
        ret.minimalize();
        return ret;
    }

    public static Fraction multiply(Fraction f1, Fraction f2) {
        int numerator = f1.getNumerator() * f2.getNumerator();
        int denominator = f1.getDenominator() * f2.getDenominator();
        Fraction ret = new Fraction(numerator,denominator);
        ret.minimalize();
        return ret;
    }

    public static Fraction divide(Fraction f1, Fraction f2) {
        int numerator = f1.getNumerator() * f2.getDenominator();
        int denominator = f1.getDenominator() * f2.getNumerator();
        Fraction ret = new Fraction(numerator, denominator);
        ret.minimalize();
        return ret;
    }

}
