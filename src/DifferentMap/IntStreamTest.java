package DifferentMap;

import java.math.BigDecimal;
import java.util.Arrays;

/**
 * Created by ktr on 2017/07/14.
 */
public class IntStreamTest {
    public static void main(String[] args) {
        int[] arr = {0, 100, 20, 40, 22, 53, 70, 199, 67};

        Arrays.stream(arr)
            .max().ifPresent(e -> System.out.println("Max : " + e));
        System.out.println("Sum : " + Arrays.stream(arr)
            .sum());
        Arrays.stream(arr)
            .average()
            .ifPresent(e -> System.out.println("Ave : " + new BigDecimal(e).setScale(2, BigDecimal.ROUND_HALF_UP)));

    }
}
