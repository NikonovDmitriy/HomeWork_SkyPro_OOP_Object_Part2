package animals;

public class Birds extends Animals {


    public String typeMovement;




    public Birds(String name, int age, String habitat) {
        super(name, age, habitat);
    }

    public Birds(String name, int age, String habitat, String typeMovement){
        super(name, age, habitat);
        this.typeMovement = typeMovement;
    }



    @Override
    public void eat() {
        super.eat();
        System.out.println("питаемся как птицы");
    }

    @Override
    public void go() {
        super.go();
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
