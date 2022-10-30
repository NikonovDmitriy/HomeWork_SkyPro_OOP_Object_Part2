package phonebook;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        task3();
        task1();

    }

    private static void task3() {
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



    private static void task1() {
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
