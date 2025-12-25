//Java 8 Stream-based Left Triangle Star Pattern Printer

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class pattern13
{
    public static void main(String[] args)
    {
        int n = 5;
        IntStream.range(1, n + 1).forEach(row -> {
            String stars = IntStream.range(1, row + 1).mapToObj(i -> "* ").collect(Collectors.joining());
            System.out.printf("%" + n * 2 + "s%n" , stars);
        });
    }
}

//Time Compelxity: O(n^2)
//Auxiliary Space Complexity: O(n)

//Output:
//                *
//              * *
//            * * *
//          * * * *
//        * * * * *