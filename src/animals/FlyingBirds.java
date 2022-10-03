package animals;

public class FlyingBirds extends Birds{

    @Override
    public void eat() {
        super.eat();
        System.out.println("питаемся как летающие птицы");
    }

    @Override
    public void go() {
        super.go();
        System.out.println("летаем над землей");
    }

    public FlyingBirds(String name, int age, String habitat, String typeMovement) {
        super(name, age, habitat, typeMovement);
    }


    public void walk() {
        System.out.println("я летаю над землей");
    }
}
