package FunctionConsumerPredicate;

import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Created by ktr on 2017/06/14.
 */
public class PredicateTest {
    public static void main(String[] args) {
        // ラムダなし
        Predicate<Integer> preTest = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return false;
            }
        };

        // 10以上かどうか判定
        Predicate<Integer> pre1 = e -> e > 10;
        System.out.println(pre1.test(30)); // true
        if (pre1.test(30)) System.out.println("30以上");

        System.out.println("----------------------------------");

        System.out.println(Stream.of(1, 50, 40, 15).anyMatch(pre1)); // true
        System.out.println(Stream.of(1, 0, 4, 10).anyMatch(pre1)); // false
        System.out.println("true の個数 : " + Stream.of(1, 100, 15, 6).filter(pre1).count()); // 2

        System.out.println("----------------------------------");

        // 100以下かどうか
        Predicate<Integer> pre2 = e -> e < 100;
        // Predicate連結
        System.out.println("and");
        System.out.println("50 : " + pre1.and(pre2).test(50)); // true
        System.out.println("110 : " + pre1.and(pre2).test(110)); // false

        System.out.println("or");
        System.out.println("50 : " + pre1.or(pre2).test(50)); // true
        System.out.println("110 : " + pre1.or(pre2).test(110)); // true
    }
}
