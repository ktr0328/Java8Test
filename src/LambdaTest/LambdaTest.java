package LambdaTest;

/**
 * Created by ktr on 2017/06/14.
 */
public class LambdaTest {
    public static void main(String[] args) {
         /*
          * Lambda
          * 型推論してくれるすごいやつ
          * コード量がごっそり減る
          * newとか型とかなんかもうほとんど消え去るけどやってることは一緒
          * スコープでちょっと戸惑いやすい
          *
          * ActionListener使うときにすごくお世話になった
          */

        // ラムダ無し
        Boo<String, Integer> boo = new Boo<String, Integer>() {
            @Override
            public Integer hoge(String s) {
                return -1;
            }
        };

        // ラムダ
        Boo<String, Integer> boo2 = String::length;
        System.out.println(boo2.hoge("ほげほげほげ"));
        System.out.println(boo2.hoge("ほげ"));

        System.out.println("------------------------------------");

        Hello hello = word -> word + " Lambda!";
        System.out.println(hello.sayHello("Hello"));
        System.out.println(hello.sayHello("Love"));
    }

    interface Hello {
        String sayHello(String word);
    }
}

interface Boo<T, R> {
    R hoge(T t);
}

