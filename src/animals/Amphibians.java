package animals;

public class Amphibians extends Animals {




    public Amphibians(String name, int age, String habitat) {
        super(name, age, habitat);
    }


    @Override
    public void eat() {
        super.eat();
        System.out.println("питаемся как земноводные");
    }

    @Override
    public void go() {
        super.go();
        System.out.println("перемещаемся как земноводные");
    }

    public void hunt() {
        System.out.println("я охочусь как земноводное");
    }
}
