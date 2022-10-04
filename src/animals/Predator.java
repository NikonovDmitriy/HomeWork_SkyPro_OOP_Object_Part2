package animals;

public class Predator extends Mammal {

    @Override
    public void eat() {
        System.out.println("питаемся как хищники");
    }

    @Override
    public void go() {
        System.out.println("перемещаемся как хищники");
    }

    public Predator(String name, int age, String habitat, String typeOfFood) {
        super(name, age, habitat, typeOfFood);
    }




    public void hunt() {
        System.out.println("я охочусь как хищник");
    }
}
