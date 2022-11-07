package transport;

import transport.Truck;
import transport.Car;
import transport.Bus;

import java.util.List;

public class Main {
    public static void main(String[] args) {


        Car car1 = new Car("Mitsubishi", "Lancer", 2.0, BodyType.SEDAN);
        car1.pitStop();
        car1.maxSpeed();
        car1.bestTime();
        car1.addDriver(new Driver<>("Bob", "Есть", "Опытный", "B"));
        car1.addMechanic(new Mechanic<Car>("Ror", "Rorovich", "Www"));
        car1.addSponsor(new Sponsor("Ted", 1));

        Car car2 = new Car("Toyota", "Corolla", 1.8, BodyType.SEDAN);
        car2.pitStop();
        car2.maxSpeed();
        car2.bestTime();

        Car car3 = new Car("Nissan", "Almera", 1.7, BodyType.SEDAN);
        car3.pitStop();
        car3.maxSpeed();
        car3.bestTime();

        Car car4 = new Car("Volkswagen", "Polo", 1.8, BodyType.SEDAN);
        car4.pitStop();
        car4.maxSpeed();
        car4.bestTime();


        Truck truck1 = new Truck("Kamaz", "Turbo", 5.5, LoadCapacity.N1);
        truck1.pitStop();
        truck1.maxSpeed();
        truck1.bestTime();
        truck1.addDriver(new Driver<>("Mike", "Есть", "Опытный", "С"));
        truck1.addMechanic(new Mechanic<>("Tom", "Tomov", "Eee"));
        truck1.addSponsor(new Sponsor("Sergey", 2));

        Truck truck2 = new Truck("Maz", "Turbo", 6.6, LoadCapacity.N2);
        truck2.pitStop();
        truck2.maxSpeed();
        truck2.bestTime();

        Truck truck3 = new Truck("Ataz", "Turbo", 7.7, LoadCapacity.N3);
        truck3.pitStop();
        truck3.maxSpeed();
        truck3.bestTime();

        Truck truck4 = new Truck("Karabaz", "Turbo", 8.8, LoadCapacity.N1);
        truck4.pitStop();
        truck4.maxSpeed();
        truck4.bestTime();


        Bus bus1 = new Bus("Laz", "Rocket", 3.5, Capacity.BIG);
        bus1.pitStop();
        bus1.maxSpeed();
        bus1.bestTime();
        bus1.addDriver(new Driver<>("Nikolas", "Есть", "Опытный", "D"));
        bus1.addMechanic(new Mechanic<>("Nik", "Nikov", "Eee"));
        bus1.addSponsor(new Sponsor("Dimarik", 2));

        Bus bus2 = new Bus("Taz", "Rocket", 5.5, Capacity.MEDIUM);
        bus2.pitStop();
        bus2.maxSpeed();
        bus2.bestTime();

        Bus bus3 = new Bus("Gaz", "Rocket", 5.5, Capacity.ESPECIALLY_BIG);
        bus3.pitStop();
        bus3.maxSpeed();
        bus3.bestTime();

        Bus bus4 = new Bus("Vaz", "Rocket", 6.5, Capacity.BIG);
        bus4.pitStop();
        bus4.maxSpeed();
        bus4.bestTime();


        List<Transport> transports = List.of(
                car1, truck1, bus1);

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.addCar(car1);
        serviceStation.addTruck(truck1);
        serviceStation.service();
        serviceStation.service();

        for (Transport transport : transports) {
            printInfo(transport);
        }

        service(car1, car2, car3, car4,
                truck1, truck2, truck3, truck4,
                bus1, bus2, bus3, bus4);


        Driver<Car> bob = new Driver<>("Bob", "B", "1 год", "B");
        Driver<Truck> tom = new Driver<>("Tom", "C", "2 года", "C");
        Driver<Bus> mike = new Driver<>("Mike", "D", "2 года", "D");
        bob.refuelCar(car1);

    }

    private static void printInfo(Transport transport) {

        System.out.println("Информация по авто " + transport.getBrand() + " " + transport.getModel());
        System.out.println("Водители: " + transport.getDrivers());
        System.out.println("Спонсоры: " + transport.getSponsors());
        System.out.println("Механики: " + transport.getMechanics());
        System.out.println();

    }

    private static void service(Transport... transports) {
        for (Transport transport : transports) {
        }
    }


    private static void serviceTransport(Transport transport) {
        try {
            if (!transport.service()) {
                throw new RuntimeException("Автомобиль " + transport.getBrand() + " " + transport.getModel() + " не прошел диагностику");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

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