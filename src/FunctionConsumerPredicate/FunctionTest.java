package FunctionConsumerPredicate;

import java.util.Optional;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by ktr on 2017/06/14.
 */
public class FunctionTest {
    public static void main(String[] args) {
        /*
         * 型 hoge() {}と一緒
         * 戻り値がもらえる
         * 連結もできる
         */

        // hashcodeを返すFunction
        Function<String, Integer> func1 = String::hashCode;
        int hash = func1.apply("あうあうあう");
        System.out.println(hash);
        // Function連結
        System.out.println(func1.andThen(e -> "@" + e).apply("あうあうあう"));

        System.out.println("--------------------------------");

        // 1から数値までを足すFunction
        Function<Integer, Integer> func2 = num -> {
            if (num < 0) return -1;

            Optional<Integer> opt = IntStream.rangeClosed(1, num).boxed().reduce((val1, val2) -> val1 + val2);
            return opt.orElse(-1);
        };

        System.out.println("--------------------------------");

        System.out.println("orElse : " + func2.apply(0)); // -1
        System.out.println("isPresent : " + func2.apply(100)); // 5050

        // (1) + (1 + 2) + (1 + 2 + 3) = 10
        System.out.println(Stream.of(1, 2, 3).map(func2).reduce((v1, v2) -> v1 + v2).orElse(-1));
    }
}
