package Comperator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by ktr on 2017/06/13.
 */
public class PatternFieldCompare {

    public static void main(String[] args) {
        // ラムダ無し 昇順用
        Comparator<Integer> comTest = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        };

        // リスト生成
        List<Person> people = new ArrayList<>();
        Collections.addAll(people,
            new Person("田中太郎", 40, 100),
            new Person("山田一郎", 99, 2000),
            new Person("鈴木五郎", 29, 2),
            new Person("佐藤和代", 18, 12),
            new Person("田中次郎", 33, -500),
            new Person("田中三郎", 15, 5)
        );

        // 出力 @sorted
        // 年齢降順
        people.stream().sorted((o1, o2) -> o2.getAge() - o1.getAge()).forEach(System.out::println);

        System.out.println("---------------------------------------------");

        // 資産昇順
        people.stream().sorted(Comparator.comparingInt(Person::getCapital)).forEach(System.out::println);
    }
}

class Person {
    private String name;
    private int age;
    private int capital;

    private static int serial = 0;
    private int id = ++serial;

    Person(String name, int age, int capital) {
        this.name = name;
        this.age = age;
        this.capital = capital;
    }

    int getAge() {
        return age;
    }

    int getCapital() {
        return capital;
    }

    @Override
    public String toString() {
        return "ID " + this.id + " : " + this.name + " (" + this.age + ") 資産 : " + this.capital + "万円";
    }
}
