package be.vdab;


import be.vdab.util.Recursive;
import java.util.Arrays;

/**
 * @author Arne Van Eycken
 * @version 1.0
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("5! = "+Recursive.faculteit(5));

        System.out.println("4e fib cijfer: "+Recursive.fib(4));

        System.out.println("2^15 = "+Recursive.macht(2.0,15));

        System.out.println("GGD van 260 en 91: "+Recursive.ggd(260,91));

        var integerList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        System.out.println("machten van 2: ");

        integerList.stream().forEach(n -> {
            System.out.println(Recursive.macht(2.0,n));
        });


    }

}
