package animals;

public class FlightlessBirds extends Birds{




    public FlightlessBirds(String name, int age, String habitat, String typeMovement) {
        super(name, age, habitat, typeMovement);
    }


    @Override
    public void eat() {
        super.eat();
        System.out.println("питаемся как нелетающие птицы");
    }

    @Override
    public void go() {
        super.go();
        System.out.println("летать не умеем, поэтому только по земле передвигаемся");

    }

    public void fly() {
        System.out.println("я гуляю, потому что не умею иначе, я же нелетающая птица");
    }
}
