package FizzBuzz;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by ktr on 2017/06/13.
 */
public class PatternList {
    public static void main(String[] args) {
        int SIZE = 20;

        // 配列の生成
        List<Integer> list = IntStream.rangeClosed(1, SIZE).boxed().collect(Collectors.toCollection(ArrayList::new));

        // 出力
        list.stream().map(i -> {
            if (isFizzBuzzNumber(i)) return fizzBuzzHelper(i);
            else return i;
        }).forEach(System.out::println);
    }

    // int -> String
    private static String fizzBuzzHelper(int num) {
        if (num % 15 == 0) return "FizzBuzz";
        else if (num % 3 == 0) return "Fizz";
        else if (num % 5 == 0) return "Buzz";

        return "なんかおかしい";
    }

    private static boolean isFizzBuzzNumber(int num) {
        return num % 3 == 0 || num % 5 == 0 || num % 15 == 0;
    }
}
