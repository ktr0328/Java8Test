package FizzBuzz;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Created by ktr on 2017/06/13.
 */
public class PatternAnti {
    public static void main(String[] args) {
        int SIZE = 20;
        int[] fb = IntStream.rangeClosed(1, SIZE).toArray();

        /*
          アンチパターン
          文章として読めないものはよろしくないと思います
          map使いましょう
         */
        Arrays.stream(fb).forEach(i -> {
            if (i % 15 == 0) System.out.println("FizzBuzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);
        });
    }
}
