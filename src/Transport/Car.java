package Transport;

import org.w3c.dom.ls.LSOutput;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Car {

    private String brand;
    private String model;
    double engineVolume;
    String color;
    private Integer productionYear;
    private String productionCountry;

    String transmission;

    private String bodyType;

    String registrationNumber;

    private int numberOfSeats;

    String rubber;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public Integer getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getRubber() {
        return rubber;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume == 0 || engineVolume < 0 ? 0 : engineVolume;
    }

    public void setColor(String color) {
        this.color = color == null || color.isEmpty() || color.isBlank() ? "default" : color;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission == null || transmission.isEmpty() || transmission.isBlank() ? "default" : transmission;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber == null || registrationNumber.isEmpty() || registrationNumber.isBlank() ? "default" : registrationNumber;
        Matcher m = Pattern.compile("[A-Z]\\d\\d\\d[A-Z][A-Z]\\d\\d\\d").matcher(registrationNumber);
        if (m.find()) {
            this.registrationNumber = registrationNumber;
        } else {
            this.registrationNumber = "некорректный номер";
        }
    }

    private CharSequence registrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
        return registrationNumber;
    }

    public void setRubber(String rubber) {
        this.rubber = rubber == null || rubber.isEmpty() || rubber.isBlank() ? "default" : rubber;
    }

    public Car(String brand, String model, Integer productionYear, String productionCountry, String color, double engineVolume, String transmission, String bodyType, String registrationNumber, int numberOfSeats) {


        this.brand = brand == null ? "default" : brand;

        this.model = model == null ? "default" : model;

        this.productionYear = productionYear == null ? 2000 : productionYear;

        this.productionCountry = productionCountry == null ? "default" : productionCountry;

        this.color = color == null ? "белый" : color;

        this.engineVolume = engineVolume == 0 ? 1.5 : engineVolume;

        this.transmission = transmission == null ? "неважно" : transmission;

        this.bodyType = bodyType == null ? "неважно" : bodyType;

        this.registrationNumber = registrationNumber == null ? "неважно" : registrationNumber;

        this.numberOfSeats = numberOfSeats < 0 ? 000 : numberOfSeats;
    }


    public void infoCar() {
        System.out.println(brand + " " + model + ", " + productionYear + " год выпуска, страна сборки " + productionCountry + ", " + color + " цвет, объем двигателя - " + engineVolume+", тип коробки "+transmission+", тип кузова "+bodyType+", регистрационный номер "+registrationNumber+", количество мест "+numberOfSeats);
    }

    public void infoRubber(){
        System.out.println("Шины заменены на сезонные");

    }

}
