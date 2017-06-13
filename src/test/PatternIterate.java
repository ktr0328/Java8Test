package test;

import java.util.stream.Stream;

/**
 * Created by ktr on 2017/06/13.
 */
public class PatternIterate {
    public static void main(String[] args) {
        /*
         * 連結し放題
         * 文章として読むことができる利点が大きい
         * for文の中にこれが書かれると思うと吐き気が
         */

        Stream.iterate(0, i -> ++i)
            .limit(20)
            .filter(i -> i > 10)
            .map(i -> i * 3)
            .distinct()
            .map(i -> i * 10)
            .sorted((o1, o2) -> o2 - o1)
            .map(PatternIterate::hoge)
            .forEach(System.out::println);
    }

    private static int hoge(int i) {
        return i - 1;
    }
}
