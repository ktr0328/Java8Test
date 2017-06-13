package FizzBuzz;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.IntStream;

/**
 * Created by ktr on 2017/06/13.
 */
public class PatternArray {
    public static void main(String[] args) {
        int SIZE = 20;

        // return String or int
        Function<Integer, ?> fizzBuzzHelper = i -> {
            if (i % 15 == 0) return "FizzBuzz";
            else if (i % 3 == 0) return "Fizz";
            else if (i % 5 == 0) return "Buzz";

            return i;
        };

        // 配列の生成
        int[] fb = IntStream.rangeClosed(1, SIZE).toArray();

        // 出力
        Arrays.stream(fb).boxed()
            .map(fizzBuzzHelper)
            .forEach(System.out::println);
    }
}
