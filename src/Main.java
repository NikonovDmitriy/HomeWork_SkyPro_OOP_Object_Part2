import Transport.Car;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Lada", "Grande", 2015, "Россия", "желтый", 1.7, "автомат", "седан", "a111aa111", 4);
        car1.infoCar();
        car1.infoRubber();

        Car car2 = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германия", "черный", 3.0, "ручная коробка", "универсал", "b222bb222", 5);
        car2.infoCar();
        car2.infoRubber();

        Car car3 = new Car("BMW", "Z8", 2021, "Германия", "черный",3.0, "автомат", "хетч-бэк", "c333cc333", 4);
        car3.infoCar();
        car3.infoRubber();

        Car car4 = new Car("KIA", "Sportage 4 поколение", 2018, "Южная Корея", "красный", 2.4, "автомат", "хетч-бэк", "d444dd444", 4);
        car4.infoCar();
        car4.infoRubber();

        Car car5 = new Car("Hyundai", "Avante", 2016, "Южная Корея", "оранжевый", 1.6, "автомат", "хетч-бэк", "e555ee555", 4);
        car5.infoCar();
        car5.infoRubber();

    }
}