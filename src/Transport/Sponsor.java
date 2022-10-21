package transport;

public class Sponsor {

    private final String name;
    private final int weight;


    public Sponsor(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }


    public void sponsoring() {
        System.out.printf("Спонсор \"%s\" проспонсировал заезд на %d%n", name, weight);

    }

    @Override
    public String toString() {
        return name + ", сумма поддержки: " + weight;
    }
}
