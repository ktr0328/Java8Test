package OptionalTest;

import java.util.Optional;

/**
 * Created by ktr on 2017/06/14.
 */
public class OptionalTest {
    public static void main(String[] args) {
        // null安全
        Optional<String> opt1 = Optional.ofNullable("のっとぬる");
        Optional<String> opt2 = Optional.ofNullable(null);

        // nullじゃなければ出力
        opt1.ifPresent(System.out::println); // ○
        opt2.ifPresent(System.out::println); // ×

        System.out.println("----------------------------------");

        // nullが発生したら何か入れる的なノリ
        System.out.println(opt1.orElse("ぬるぬる")); // のっとぬる
        System.out.println(opt2.orElse("ぬるぬる")); // null

        System.out.println("----------------------------------");

        // Streamに近い形で書ける
        opt1.map(e -> e + e).ifPresent(System.out::println); // ○
        opt2.map(e -> e + e).ifPresent(System.out::println); // ×

    }
}
