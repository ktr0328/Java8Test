package Collectors;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by ktr on 2017/07/14.
 */
public class CollectorsTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("boo", "baa", "hoge", "hage");
        System.out.println(list.stream().collect(Collectors.joining()));

        List<User> userList =
            Arrays.asList(new User("hoge"), new User("hage"), new User("boo"), new User("baa"));

        System.out.println(String.join("-", "b", "c", "d"));

        List<Integer> integerList = Arrays.asList(1, 2, 2, 5, 6, 7, 8, 1);
        System.out.println(integerList.stream().collect(Collectors.groupingBy(e -> e % 2 == 1)));
    }
}

class User {
    static int serial;
    private int id;
    String username;

    User(String username) {
        this.id = ++serial;
        this.username = username;
    }

    public int getId() {
        return id;
    }
}
