public class Car {

    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    void infoCar() {
        System.out.println(brand +" "+ model+", " + productionYear + " год выпуска, страна сборки " + productionCountry+", " + color + " цвет, объем двигателя - " + engineVolume);
    }
}
