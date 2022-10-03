package animals;

public class Predators extends Mammals{

    @Override
    public void eat() {
        super.eat();
        System.out.println("питаемся как хищники");
    }

    @Override
    public void go() {
        super.go();
        System.out.println("перемещаемся как хищники");
    }

    public Predators(String name, int age, String habitat, String typeOfFood) {
        super(name, age, habitat, typeOfFood);
    }




    public void hunt() {
        System.out.println("я охочусь как хищник");
    }
}
