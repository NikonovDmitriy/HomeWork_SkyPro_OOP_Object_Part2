package animals;

public abstract class Animal {

    private String name;
    private int age;
    private String habitat;





    public Animal(String name, int age, String habitat) {
        this.setName(name);
        this.setAge(age);
        this.setHabitat(habitat);
    }





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null || name.isBlank() ? "животное" : name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age < 1 ? 1 : age;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat == null || habitat.isBlank() ? "default" : habitat;
    }





    public abstract void eat();

    public abstract void sleep();

    public abstract void go();





}
