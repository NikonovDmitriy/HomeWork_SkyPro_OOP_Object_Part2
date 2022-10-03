package animals;

public class Mammals extends Animals {


    @Override
    public void eat() {
        super.eat();
        System.out.println("питаемся как млекопитающие");
    }

    @Override
    public void go() {
        super.go();
        System.out.println("передвигаемся как млекопитающие");
    }

    public int speedTravel;
    public String typeOfFood;




    public Mammals(String name, int age, String habitat, String typeOfFood) {
        super(name, age, habitat);
    }

    public Mammals(String name, int age, String habitat, int speedTravel, String typeOfFood) {
        super(name, age, habitat);
        this.speedTravel = speedTravel;
        this.typeOfFood = typeOfFood;
    }




    public int getSpeedTravel() {
        return speedTravel;
    }

    public void setSpeedTravel(int speedTravel) {
        this.speedTravel = speedTravel <= 0 ? 0 : speedTravel;
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = typeOfFood == null || typeOfFood.isBlank() ? "default" : typeOfFood;
    }




    public void walk() {
        System.out.println("я гуляю");
    }
}
