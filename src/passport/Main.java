package passport;

import java.util.HashMap;
import java.util.Map;

public class Main {

    private static Map<Integer, Passport> map = new HashMap<>();

    public static void main(String[] args) {
        Passport p = new Passport(23145678, "Dima", "Nikonov", null, 1990);
        addPassport(p);

        Passport passport = getPassportByNumber(23145678);
    }

    public static void addPassport(Passport p) {
        map.put(p.getNumber(), p);
    }

    public static Passport getPassportByNumber(int number) {
        return map.get(number);
    }

}
