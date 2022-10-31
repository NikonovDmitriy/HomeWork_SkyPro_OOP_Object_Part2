package phonebook;

import java.awt.image.ImageProducer;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        task2_2();
        task2_1();
        task1_3();
        task1_1();
    }


    private static void task2_2() {
        Map<Integer, String> map = new LinkedHashMap<>();

        for (int i = 10; i > 0 ; i--) {
            map.put(i, "str" + (i));
        }

        map.forEach((k, v) ->System.out.println(k + " " + v));
    }



    private static void task2_1() {
        Map<String, List<Integer>> map = new HashMap<>();
        fillMap(map);

        Map<String, Integer> newMap = new HashMap<>();

        for (Map.Entry<String, List<Integer>> e : map.entrySet()) {
            newMap.put(e.getKey(), e.getValue().stream().mapToInt(i -> i).sum());
        }

        newMap.forEach((k, v) -> System.out.println(k + " " + v));
    }

    private static void fillMap(Map<String, List<Integer>> map) {
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            map.put(("str" + (i + 1)), List.of(r.nextInt(1000), r.nextInt(1000), r.nextInt(1000)));
        }
    }



    private static void task1_3() {
        Map<String, Integer> map = new HashMap<>();

        String key = "123";
        int value = 123;
        add(key, value, map);
    }

    private static void add(String k, int v, Map<String, Integer> map) {
        if (map.containsKey(k) && map.get(k).equals(v)) {
            throw new IllegalArgumentException();
        }
        map.put(k, v);
    }




    private static void task1_1() {
        var phoneBook = new PhoneBook();
        fillPhoneBook(phoneBook);
        phoneBook.showAll();
    }

    private static void fillPhoneBook(PhoneBook pn) {
        for (int i = 0; i < 20; i++) {
            pn.add(("Name" + i), String.valueOf(i).repeat(6));


        }
    }
}
