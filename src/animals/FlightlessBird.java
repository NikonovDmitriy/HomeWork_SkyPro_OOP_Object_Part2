package animals;

public class FlightlessBird extends Bird {




    public FlightlessBird(String name, int age, String habitat, String typeMovement) {
        super(name, age, habitat, typeMovement);
    }


    @Override
    public void eat() {
        System.out.println("питаемся как нелетающие птицы");
    }

    @Override
    public void go() {
        System.out.println("летать не умеем, поэтому только по земле передвигаемся");

    }

    public void walk() {
        System.out.println("я гуляю, потому что не умею иначе, я же нелетающая птица");
    }
}
