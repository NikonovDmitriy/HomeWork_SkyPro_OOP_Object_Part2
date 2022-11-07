package animals;



public class Main {
    public static void main(String[] args) {

        Herbivor gazelle = new Herbivor("газель", 1, "суша", "травоядное");
        Herbivor giraffe = new Herbivor("жираф", 2, "суша", "травоядное");
        Herbivor horse = new Herbivor("лошадь", 3, "суша", "травоядное");

        Predator hyena = new Predator("гиена", 4, "суша", "хищник");
        Predator tiger = new Predator("тигр", 5, "суша", "хищник");
        Predator bear = new Predator("медведь", 6, "суша", "хищник");

        Amphibian frog = new Amphibian("лягушка", 7, "суша и вода");
        Amphibian already = new Amphibian("уж пресноводный", 8, "суша и вода");

        FlightlessBird peacock = new FlightlessBird("павлин", 9, "земля", "без крыльев");
        FlightlessBird penguin = new FlightlessBird("пингвин", 10, "земля", "без крыльев");
        FlightlessBird dodo = new FlightlessBird("птица додо", 11, "земля", "без крыльев");

        FlyingBird gull = new FlyingBird("чайка", 12, "земля", "с крыльями");
        FlyingBird albatross = new FlyingBird("альбатрос", 13, "земля", "с крыльями");
        FlyingBird falcon = new FlyingBird("соколо", 14, "земля", "с крыльями");


    }
}