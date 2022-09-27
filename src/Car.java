public class Car {

    private final String brand;
    private final String model;
    private final double engineVolume;
    private final String color;
    private final Integer productionYear;
    private final String productionCountry;

    public Car(String brand, String model, Integer productionYear, String productionCountry, String color, double engineVolume) {


        this.brand = brand == null ? "default" : brand;

        this.model = model == null ? "default" : model;

        this.productionYear = productionYear == null ? 2000 : productionYear;

        this.productionCountry = productionCountry == null ? "default" : productionCountry;

        this.color = color == null ? "белый" : color;

        this.engineVolume = engineVolume == 0 ? 1.5 : engineVolume;

    }


    void infoCar() {
        System.out.println(brand + " " + model + ", " + productionYear + " год выпуска, страна сборки " + productionCountry + ", " + color + " цвет, объем двигателя - " + engineVolume);
    }
}
