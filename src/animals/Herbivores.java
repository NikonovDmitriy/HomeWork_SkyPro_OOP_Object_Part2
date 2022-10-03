package animals;

public class Herbivores extends Mammals{


    @Override
    public void eat() {
        super.eat();
        System.out.println("питаемся как травоядные");
    }

    @Override
    public void go() {
        super.go();
        System.out.println("перемещаемся как травоядные");
    }

    public Herbivores(String name, int age, String habitat, String typeOfFood) {
        super(name, age, habitat, typeOfFood);
    }




    public void graze() {
        System.out.println("я пасусь на лугу");
    }
}
