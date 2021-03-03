package be.vdab;


import be.vdab.util.Recursive;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author Arne Van Eycken
 * @version 1.0
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("5! = "+Recursive.faculteit(5));

        System.out.println("4e fib cijfer: "+Recursive.fib(4));

        System.out.println("-2^6 = "+Recursive.macht(-2.0,6));

        System.out.println("-2^7 = "+Recursive.macht(-2.0,7));

        System.out.println("GGD van 260 en 91: "+Recursive.ggd(125.25,65.25));

        var integerList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        System.out.print("machten van 2: ");
        System.out.println(
                integerList.stream()
                        .map(n -> (int)Recursive.macht(2.0,n))
                        .map(Object::toString)
                        .collect(Collectors.joining(", "))
        );

    }

}
