package animals;

public class Amphibian extends Animal {




    public Amphibian(String name, int age, String habitat) {
        super(name, age, habitat);
    }


    @Override
    public void eat() {
        System.out.println("питаемся как земноводные");
    }

    @Override
    public void sleep() {
        System.out.println("мы спим как земноводные");
    }

    @Override
    public void go() {
        System.out.println("перемещаемся как земноводные");
    }

    public void hunt() {
        System.out.println("я охочусь как земноводное");
    }
}
