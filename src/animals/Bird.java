package animals;

public class Bird extends Animal {


    private String typeMovement;




    public Bird(String name, int age, String habitat) {
        super(name, age, habitat);
    }

    public Bird(String name, int age, String habitat, String typeMovement){
        super(name, age, habitat);
        this.setTypeMovement(typeMovement);
    }



    @Override
    public void eat() {
        System.out.println("питаемся как птицы");
    }

    @Override
    public void sleep() {
        System.out.println("мы спим по-птичьи");
    }

    @Override
    public void go() {
        System.out.println("умеем летать и не летаем, по-разному");
    }




    public String getTypeMovement() {
        return typeMovement;
    }

    public void setTypeMovement(String typeMovement) {
        this.typeMovement = typeMovement == null || typeMovement.isBlank() ? "default" : typeMovement;
    }

    public void hunt() {
        System.out.println("я охочусь по-птичьи");
    }
}
