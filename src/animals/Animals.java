package animals;

public abstract class Animals {

    public String name;
    public int age;
    public String habitat;





    public Animals(String name, int age, String habitat) {
        this.name = name;
        this.age = age;
        this.habitat = habitat;
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





    public void eat() {
        System.out.println("я поглощаю пищу");
    }

    public void sleep() {
        System.out.println("я блуждаю во снах");
    }

    public void go() {
        System.out.println("я навожу суету");
    }




    public static void main(String[] args) {

        Herbivores gazelle = new Herbivores("газель", 1, "суша", "травоядное");
        Herbivores giraffe = new Herbivores("жираф", 2, "суша", "травоядное");
        Herbivores horse = new Herbivores("лошадь", 3, "суша", "травоядное");

        Predators hyena = new Predators("гиена", 4, "суша", "хищник");
        Predators tiger = new Predators("тигр", 5, "суша", "хищник");
        Predators bear = new Predators("медведь", 6, "суша", "хищник");

        Amphibians frog = new Amphibians("лягушка", 7, "суша и вода");
        Amphibians already = new Amphibians("уж пресноводный", 8, "суша и вода");

        FlightlessBirds peacock = new FlightlessBirds("павлин", 9, "земля", "без крыльев");
        FlightlessBirds penguin = new FlightlessBirds("пингвин", 10, "земля", "без крыльев");
        FlightlessBirds dodo = new FlightlessBirds("птица додо", 11, "земля", "без крыльев");

        FlyingBirds gull = new FlyingBirds("чайка", 12, "земля", "с крыльями");
        FlyingBirds albatross = new FlyingBirds("альбатрос", 13, "земля", "с крыльями");
        FlyingBirds falcon = new FlyingBirds("соколо", 14, "земля", "с крыльями");



    }
}
