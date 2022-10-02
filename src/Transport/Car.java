package transport;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Car {

    private final String brand;
    private final String model;
    double engineVolume;
    private String color;
    private final Integer productionYear;
    private final String productionCountry;

    private String transmission;

    private final String bodyType;

    private String registrationNumber;

    private final int numberOfSeats;

    private String rubber;

    private Key key;

    private Key.Insurance insurance;

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
        this.color = color == null || color.isBlank() ? "default" : color;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission == null || transmission.isBlank() ? "default" : transmission;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber == null || registrationNumber.isBlank() ? "default" : registrationNumber;
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
        this.rubber = rubber == null || rubber.isBlank() ? "default" : rubber;
    }

    public Car(String brand,
               String model,
               Integer productionYear,
               String productionCountry,
               String color,
               double engineVolume,
               String transmission,
               String bodyType,
               String registrationNumber,
               int numberOfSeats,
               Key key,
               Key.Insurance insurance) {


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

        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }

        if (insurance == null) {
            this.insurance = new Key.Insurance();
        }else {
            this.insurance = insurance;
        }
    }


    public void infoCar() {
        System.out.println(brand + " " + model + ", " + productionYear + " год выпуска, страна сборки " + productionCountry + ", " + color + " цвет, объем двигателя - " + engineVolume + ", тип коробки " + transmission + ", тип кузова " + bodyType + ", регистрационный номер " + registrationNumber + ", количество мест " + numberOfSeats);
    }

    public void infoRubber() {
        System.out.println("Шины заменены на сезонные");

    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }


    public static class Key {
        private boolean remoteEngineStart;
        private boolean keylessAccess;


        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;

        public Key () {
                this(false, false);
            }

            public boolean isRemoteEngineStart () {
                return remoteEngineStart;
            }

            public boolean isKeylessAccess () {
                return keylessAccess;
            }


        }

        public static class Insurance {
            private final LocalDate validity;
            private final double price;
            private final String number;


            public Insurance(LocalDate validity, double price, String number) {
                this.validity = validity == null ? LocalDate.now().plusDays(365) : validity;
                this.price = price;
                this.number = number == null ? "123456789" : number;
            }

            public LocalDate getValidity() {
                return validity;
            }

            public double getPrice() {
                return price;
            }

            public String getNumber() {
                return number;
            }

            public void infoValidity() {
                if (validity.isBefore(LocalDate.now()) || validity.isEqual(LocalDate.now())) {
                    System.out.println("нужно срочно ехать оформлять новую страховку!");
                }
            }

            public void infoNumber() {
                if (number.length() != 9) {
                    System.out.println("Номер страховки некорректный!");
                }
            }
        }

    }

}
