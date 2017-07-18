package ParallelStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by ktr on 2017/07/14.
 */
public class ParallelStreamTest {
    public static void main(String[] args) {
        List<Integer> list = IntStream.rangeClosed(0, 1000000).boxed().collect(Collectors.toCollection(ArrayList::new));
        long start = System.nanoTime();
//        list.parallelStream().map(e -> "Hello!" + e).forEach(System.out::println);
        list.stream().map(e -> "Hello!" + e).forEach(System.out::println);
        System.out.println((int)((System.nanoTime() - start) / 1000 / 1000 / 10));

        // なんかどっちも結果大して変わらないんだけど・・・？
    }
}
