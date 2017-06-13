package test;

import java.util.stream.Stream;

/**
 * Created by ktr on 2017/06/13.
 */
public class patternIterate {
    public static void main(String[] args) {
        Stream.iterate(0, i -> ++i)
            .limit(20)
            .filter(i -> i > 10)
            .map(i -> i * 3)
            .distinct()
            .map(i -> i * 10)
            .sorted((o1, o2) -> o2 - o1)
            .map(patternIterate::hoge)
            .forEach(System.out::println);
    }

    private static int hoge(int i) {
        return i - 1;
    }
}
