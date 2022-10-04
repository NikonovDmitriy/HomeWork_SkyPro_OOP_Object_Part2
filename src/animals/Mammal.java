package animals;

public class Mammal extends Animal {


    @Override
    public void eat() {
        System.out.println("питаемся как млекопитающие");
    }

    @Override
    public void sleep() {
        System.out.println("мы спим как млекопитающие");
    }

    @Override
    public void go() {
        System.out.println("передвигаемся как млекопитающие");
    }

    private int speedTravel;
    private String typeOfFood;




    public Mammal(String name, int age, String habitat, String typeOfFood) {
        super(name, age, habitat);
    }

    public Mammal(String name, int age, String habitat, int speedTravel, String typeOfFood) {
        super(name, age, habitat);
        this.setSpeedTravel(speedTravel);
        this.setTypeOfFood(typeOfFood);
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
