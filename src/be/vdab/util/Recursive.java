package be.vdab.util;

/**
 * @author Arne Van Eycken
 * @version 1.0
 */

public class Recursive {

    public static int faculteit(int n) {
        if (n == 0) return 1;
        else return n * faculteit(n - 1);
    }

    public static long fib(long n) {
        if ((n == 0) || (n == 1)) return n;
        else return fib(n - 1) + fib(n - 2);
    }

    public static double macht(double x, int y) {
        if (y == 0) return 1.0;
        else if (y % 2 == 0) return macht(x * x,y / 2);
        else return x * macht(x,y - 1);
    }

    public static double ggd(int x, int y) {
        if (x == y) return x;
        else if (x < y ) return ggd(x,y-x);
        else return ggd(x - y, x);
    }


}
