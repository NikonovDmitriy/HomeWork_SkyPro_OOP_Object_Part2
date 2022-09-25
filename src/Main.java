public class Main {
    public static void main(String[] args) {


        Car car1 = new Car("Lada", "Grande", 2015, "Россия", "желтый", 1.7);
        car1.infoCar();

        Car car2 = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германия", "черный", 3.0);
        car2.infoCar();

        Car car3 = new Car("BMW", "Z8", 2021, "Германия", "черный",3.0);
        car3.infoCar();

        Car car4 = new Car("KIA", "Sportage 4 поколение", 2018, "Южная Корея", "красный", 2.4);
        car4.infoCar();

        Car car5 = new Car("Hyundai", "Avante", 2016, "Южная Корея", "оранжевый", 1.6);
        car5.infoCar();

    }
}