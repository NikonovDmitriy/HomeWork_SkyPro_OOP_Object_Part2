public class Main {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.brand = "Lada";
        car1.model = "Grande";
        car1.engineVolume = 1.7;
        car1.color = "желтый";
        car1.productionCountry = "Россия";
        car1.productionYear = 2015;
        car1.infoCar();

        Car car2 = new Car();
        car2.brand = "Audi";
        car2.model = "A8 50 L TDI quattro";
        car2.engineVolume = 3.0;
        car2.color = "черный";
        car2.productionCountry = "Германия";
        car2.productionYear = 2020;
        car2.infoCar();

        Car car3 = new Car();
        car3.brand = "BMW";
        car3.model = "Z8";
        car3.engineVolume = 3.0;
        car3.color = "черный";
        car3.productionCountry = "Германия";
        car3.productionYear = 2021;
        car3.infoCar();

        Car car4 = new Car();
        car4.brand = "BMW";
        car4.model = "Sportage 4 поколение";
        car4.engineVolume = 2.4;
        car4.color = "красный";
        car4.productionCountry = "Южная Корея";
        car4.productionYear = 2018;
        car4.infoCar();

        Car car5 = new Car();
        car5.brand = "Hyundai";
        car5.model = "Avante";
        car5.engineVolume = 1.6;
        car5.color = "оранжевый";
        car5.productionCountry = "Южная Корея";
        car5.productionYear = 2016;
        car5.infoCar();
    }
}