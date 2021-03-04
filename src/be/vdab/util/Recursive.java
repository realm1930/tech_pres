package be.vdab.util;

/**
 * Recursieve functies
 * @author Arne Van Eycken
 * @version 1.0
 */

public class Recursive {

    /**
     * Recursieve functie die de faculteit van een natuurlijk getal berekend.
     * @param n een natuurlijk getal
     * @return n!
     * */

    public static long faculteit(long n) {
        //validatie negatieve waarde
        if (n < 0) throw new IllegalArgumentException("Een faculteit van een negatief getal bestaat niet.");
        //basisvoorwaarde
        if (n == 0) return 1;
        else return n * faculteit(n - 1);
    }

    /**
     * Recursieve functie die een natuurlijk getal als parameter meekrijgt en
     * berekend welk getal op die plaats in de reeks van Fibonacci voorkomt.
     * @param n een natuurlijk postief getal
     * @return Getal op n(de) plaats in de reeks van Fibonacci
     * */
    public static long fib(long n) {
        if ((n == 0) || (n == 1)) return n;
        //negatieve invoer
        else if (n < 0) return -fibRec(Math.abs(n));
        //positieve invoer
        else return fibRec(n);
    }
    private static long fibRec(long n) {
        //basisvoorwaarde
        if ((n == 0) || (n == 1)) return n;
        else return fibRec(n - 1) + fibRec(n - 2);
    }

    /**
     * Recursieve functie die een decimaal getal en zijn exponent als parameters meekrijgt
     * en het eerste getal tot de macht van het tweede getal berekend.
     * @param x een rationaal getal
     * @param y een natuurlijk getal, de exponent
     * @return x tot de macht y
     * */
    public static double macht(double x, int y){
        if (y == 0) return 1.0;
        double baseValue;
        boolean exponentIsEven = y%2==0;
        //even exponent
        if (exponentIsEven) baseValue = machtRec(Math.abs(x),Math.abs(y));
        //oneven exponent
        else baseValue = machtRec(x,Math.abs(y));
        //negatieve exponent
        if (y < 0) return 1/baseValue;
        //positieve exponent
        return baseValue;
    }
    private static double machtRec(double x, int y) {
        boolean exponentIsEven = y%2==0;
        //basisvoorwaarde
        if (y == 0) return 1.0;
        else if (exponentIsEven) return machtRec(x * x,y / 2);
        else return x * machtRec(x,y - 1);
    }

    /**
     * Recursieve functie die de grootste gemene deler van twee getallen berekend.
     * @param x een rationaal getal
     * @param y een rationaal getal
     * @return Grootste gemende deler van x en y
     * */
    public static double ggd(double x, double y) {
        //basisvoorwaarde
        if (x == y) return x;
        else if (x < y ) return ggd(x,y - x);
        else return ggd(x - y, x);
    }
}
