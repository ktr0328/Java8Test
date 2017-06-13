package FunctionConsumerPredicate;

import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * Created by ktr on 2017/06/14.
 */
public class ConsumerTest {
    public static void main(String[] args) {
        // ラムダなし
        Consumer<String> testCon = new Consumer<String>() {
            @Override
            public void accept(String s) {
                // 処理
            }
        };

        // void
        Consumer<String> con1 = e -> System.out.println(e + e);
        con1.accept("ぶー");

        System.out.println("---------------------------------------");

        // 10文字以上かどうか判定して出力
        Consumer<String> con2 = e -> {
            if (e.length() > 10) System.out.println(e + " : 10文字以上");
            else System.out.println(e);
        };
        // Streamを作ってそれぞれにあてる
        Stream.of("ああ", "いい", "うわあああああああああ").forEach(con2);

        System.out.println("---------------------------------------");

        // Consumer連結
        Consumer<String> con3 = e -> System.out.println("length : " + e.length());
        con1.andThen(con2).accept("ふおおおおおおおおおおおお");
    }
}
