package animals;

public class Herbivor extends Mammal {


    @Override
    public void eat() {
        System.out.println("питаемся как травоядные");
    }

    @Override
    public void go() {
        System.out.println("перемещаемся как травоядные");
    }

    public Herbivor(String name, int age, String habitat, String typeOfFood) {
        super(name, age, habitat, typeOfFood);
    }




    public void graze() {
        System.out.println("я пасусь на лугу");
    }
}
