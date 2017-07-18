package FlatMap;

import java.util.Arrays;

/**
 * Created by ktr on 2017/07/14.
 */
public class FlatMapTest {
    public static void main(String[] args) {
        /**
         * 要するに二重ループ
         * Streamの中でStreamを開く
         */
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Arrays.stream(arr).forEach(System.out::println);
        System.out.println("---------------------------------");
        Arrays.stream(arr).flatMap(e -> Arrays.stream(e).boxed()).forEach(System.out::println);
    }
}
