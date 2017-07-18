package NoSemicolon;

import java.util.stream.IntStream;

/**
 * Created by ktr on 2017/07/14.
 */
public class NoSemicolon {
    public static void main(String[] args) {
        // 全くもって無理やりにしか見えないんだけど・・・
        if (IntStream.rangeClosed(1, 10).peek(System.out::println).count() == 0) {}

        System.out.println("----------------------------");
        // FizzBuzz @ no semicolon
        if (IntStream.rangeClosed(1, 20).boxed()
                .map(e -> e % 15 == 0 ? "FizzBuzz" :
                     e % 3 == 0 ? "Fizz" :
                     e % 5 == 0 ? "Buzz" : "" + e)
                .peek(System.out::println)
                .count() == 0) {}
        // まじ難解
    }
}
