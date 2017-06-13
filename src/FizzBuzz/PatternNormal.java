package FizzBuzz;

/**
 * Created by ktr on 2017/06/13.
 */
public class PatternNormal {
    public static void main(String[] args) {
        int SIZE = 20;
        int[] fb = new int[SIZE];

        /*
         インデックスを操作するのが嫌なところ
         気を抜くとすぐにArrayIndexOutOfBounds
         i + 1 してるとこが特に気に食わない
        */
        for (int i = 0; i < SIZE; i++) {
            fb[i] = i + 1;
        }

        for (int value : fb) {
            System.out.println(fizzBuzzHelper(value));
        }
    }

    private static String fizzBuzzHelper(int num) {
        if (num % 15 == 0) return "FizzBuzz";
        else if (num % 3 == 0) return "Fizz";
        else if (num % 5 == 0) return "Buzz";

        else return String.valueOf(num);
    }
}
