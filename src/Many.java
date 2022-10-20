import java.util.HashSet;
import java.util.Set;

public class Many {


        public static Set<Integer> randomNumbers(){
            Set<Integer> integers = new HashSet<>();
            for (int i = 0; i < 20; i++) {
                double random = Math.random() * 1000;
                integers.add((int) random);
            }
            integers.removeIf(integer -> integer % 2 == 0);
            return integers;
        }

    }






