package String;

/**
 * Created by ktr on 2017/06/14.
 */
public class ResolveString {
    public static void main(String[] args) {
        String hoge = "String=>Streamにするテスト";

        hoge.chars()
            .boxed()
            .map(Character::toChars)
            .forEach(System.out::println);

        // String => IntStream => Stream => char[] => output
        // 結論 : めんどくさいけどできなくはないがパフォーマンスがー
    }
}
