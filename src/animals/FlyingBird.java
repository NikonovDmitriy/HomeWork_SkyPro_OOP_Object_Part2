package animals;

public class FlyingBird extends Bird {

    @Override
    public void eat() {
        System.out.println("питаемся как летающие птицы");
    }

    @Override
    public void go() {
        System.out.println("летаем над землей");
    }

    public FlyingBird(String name, int age, String habitat, String typeMovement) {
        super(name, age, habitat, typeMovement);
    }


    public void fly() {
        System.out.println("я летаю над землей");
    }
}
