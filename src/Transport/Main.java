package transport;

import transport.Truck;
import transport.Car;
import transport.Bus;

public class Main {
    public static void main(String[] args) {


        Car car1 = new Car("Mitsubishi", "Lancer", 2.0);
        Car car2 = new Car("Toyota", "Corolla", 1.8);
        Car car3 = new Car("Nissan", "Almera", 1.7);
        Car car4 = new Car("Volkswagen", "Polo", 1.8);

        Truck truck1 = new Truck("Kamaz", "Turbo", 5.5);
        Truck truck2 = new Truck("Maz", "Turbo", 6.6);
        Truck truck3 = new Truck("Ataz", "Turbo", 7.7);
        Truck truck4 = new Truck("Karabaz", "Turbo", 8.8);

        Bus bus1 = new Bus("Laz", "Rocket", 3.5);
        Bus bus2 = new Bus("Taz", "Rocket", 5.5);
        Bus bus3 = new Bus("Gaz", "Rocket", 5.5);
        Bus bus4 = new Bus("Vaz", "Rocket", 6.5);



    }
}
//
//        Car car1 = new Car("Lada", "Grande", 2015, "Россия", "желтый", 1.7, "автомат", "седан", "a111aa111", 4, null, null, null);
//
//        car1.infoCar();
//        car1.infoRubber();
//        car1.refill();
//
//        Car car2 = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германия", "черный", 3.0, "ручная коробка", "универсал", "b222bb222", 5, null, null, null);
//
//        car2.infoCar();
//        car2.infoRubber();
//        car2.refill();
//
//        Car car3 = new Car("BMW", "Z8", 2021, "Германия", "черный", 3.0, "автомат", "хетч-бэк", "c333cc333", 4, null, null, null);
//        car3.infoCar();
//        car3.infoRubber();
//        car3.refill();
//
//        Car car4 = new Car("KIA", "Sportage 4 поколение", 2018, "Южная Корея", "красный", 2.4, "автомат", "хетч-бэк", "d444dd444", 4, null, null, null);
//
//        car4.infoCar();
//        car4.infoRubber();
//        car4.refill();
//
//        Car car5 = new Car("Hyundai", "Avante", 2016, "Южная Корея", "оранжевый", 1.6, "автомат", "хетч-бэк", "e555ee555", 4, null, null, null);
//
//        car5.infoCar();
//        car5.infoRubber();
//        car5.refill();
//        System.out.println();
//
//
//        Train train1 = new Train("Поезд Ласточка",
//                "B-901",
//                2011,
//                "Россия",
//                null, 301,
//                3500,
//                0, "Белорусский вокзал", "Минск-Пассажирский",
//                11);
//        train1.infoTrain();
//        train1.refill();
//
//        Train train2 = new Train("Поезд Ленинград",
//                "D-125",
//                2019,
//                "Россия",
//                null, 270,
//                1700,
//                0, "Ленинградский вокзал", "Ленинград-Пассажирский",
//                8);
//        train2.infoTrain();
//        train2.refill();
//        System.out.println();
//
//
//
//
//        Bus bus1 = new Bus("ЛАЗ", "99", 2020, "Россия",
//                "желтый", 150);
//        bus1.infoBus();
//        bus1.refill();
//
//        Bus bus2 = new Bus("ВАЗ", "88", 2010, "Россия",
//                "красный", 140);
//        bus2.infoBus();
//        bus2.refill();
//
//        Bus bus3 = new Bus("ПАЗ", "77", 2000, "Россия",
//                "синий", 120);
//        bus3.infoBus();
//        bus3.refill();
//
//
//    }
//}