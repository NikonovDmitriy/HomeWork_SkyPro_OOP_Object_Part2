package transport;

//
//import org.w3c.dom.ls.LSOutput;
//
//import java.time.LocalDate;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
public class Car extends Transport implements Emulous {

    private BodyType bodyType;

    public Car(String brand, String model, double engineVolume, BodyType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public void startMoving() {
        System.out.println("старт легкового авто");

    }

    @Override
    public void finishMoving() {
        System.out.println("финиш легкового авто");

    }

    @Override
    public void infoType() {
        if (bodyType == null) {
            System.out.println("данных недостаточно");
        } else {
            System.out.println("Тип кузова авто - " + bodyType);
        }

    }

    @Override
    public boolean diagnosed() {
        return Math.random() > 0.7;
    }

    @Override
    public void pitStop() {
        System.out.println("пит-стоп как у легкового авто");

    }

    @Override
    public void maxSpeed() {
        System.out.println("максимальная скорость легкового авто 350км/ч");

    }

    @Override
    public void bestTime() {
        System.out.println("лучшее время круга легкового авто 2 минуты");

    }

}

//
//
//    private double engineVolume;
//
//    private String transmission;
//
//    private final String bodyType;
//
//    private String registrationNumber;
//
//    private final int numberOfSeats;
//
//    private String rubber;
//
//    private Key key;
//
//    private Insurance insurance;
//
//
//    public double getEngineVolume() {
//        return engineVolume;
//    }
//
//
//    public String getTransmission() {
//        return transmission;
//    }
//
//    public String getBodyType() {
//        return bodyType;
//    }
//
//    public String getRegistrationNumber() {
//        return registrationNumber;
//    }
//
//    public int getNumberOfSeats() {
//        return numberOfSeats;
//    }
//
//    public String getRubber() {
//        return rubber;
//    }
//
//    public void setEngineVolume(double engineVolume) {
//        this.engineVolume = engineVolume == 0 || engineVolume < 0 ? 0 : engineVolume;
//    }
//
//    public void setTransmission(String transmission) {
//        this.transmission = transmission == null || transmission.isBlank() ? "default" : transmission;
//    }
//
//    public void setRegistrationNumber(String registrationNumber) {
//        this.registrationNumber = registrationNumber == null || registrationNumber.isBlank() ? "default" : registrationNumber;
//        Matcher m = Pattern.compile("[A-Z]\\d\\d\\d[A-Z][A-Z]\\d\\d\\d").matcher(registrationNumber);
//        if (m.find()) {
//            this.registrationNumber = registrationNumber;
//        } else {
//            this.registrationNumber = "некорректный номер";
//        }
//    }
//
//
//    private CharSequence registrationNumber(String registrationNumber) {
//        this.registrationNumber = registrationNumber;
//        return registrationNumber;
//    }
//
//    public void setRubber(String rubber) {
//        this.rubber = rubber == null || rubber.isBlank() ? "default" : rubber;
//    }
//
//    public Car(String brand,
//               String model,
//               Integer productionYear,
//               String productionCountry,
//               String color,
//               double engineVolume,
//               String transmission,
//               String bodyType,
//               String registrationNumber,
//               int numberOfSeats,
//               Key key,
//               Insurance insurance,
//               Integer maxSpeed) {
//
//        super(brand, model, productionYear, productionCountry, color, maxSpeed);
//
//
//        this.setBrand(brand);
//
//        this.setModel(model);
//
//        this.setProductionYear(productionYear);
//
//        this.setProductionCountry(productionCountry);
//
//        this.setColor(color);
//
//        this.setEngineVolume(engineVolume);
//
//        this.setTransmission(transmission);
//
//        this.bodyType = bodyType == null ? "неважно" : bodyType;
//
//        this.setRegistrationNumber(registrationNumber);
//
//        this.numberOfSeats = numberOfSeats < 0 ? 000 : numberOfSeats;
//
//        if (key == null) {
//            this.key = new Key();
//        } else {
//            this.key = key;
//        }
//
//        if (insurance == null) {
//            this.insurance = new Insurance(null, 0, null);
//        } else {
//            this.insurance = insurance;
//        }
//    }
//
//
//    public void infoCar() {
//        System.out.println(getBrand() + " " + getModel() + ", " + getProductionYear() + " год выпуска, страна сборки "
//                + getProductionCountry() + ", " + getColor() + " цвет, объем двигателя - " + getEngineVolume() + ", тип коробки "
//                + getTransmission() + ", тип кузова " + getBodyType() + ", регистрационный номер " + getRegistrationNumber()
//                + ", количество мест " + getNumberOfSeats());
//    }
//
//    public void infoRubber() {
//        System.out.println("Шины заменены на сезонные");
//
//    }
//
//    public Key getKey() {
//        return key;
//    }
//
//    public void setKey(Key key) {
//        this.key = key;
//    }
//
//    @Override
//    public void refill() {
//        System.out.println("Можно заправлять бензином, дизелем на заправке или заряжать на специальных электроду-парковках, если это электрокар!");
//    }
//
//
//    public static class Key {
//        private final boolean remoteEngineStart;
//        private final boolean keylessAccess;
//
//
//        public Key(boolean remoteEngineStart, boolean keylessAccess) {
//            this.remoteEngineStart = remoteEngineStart;
//            this.keylessAccess = keylessAccess;
//        }
//
//        public Key () {
//                this(false, false);
//            }
//
//            public boolean isRemoteEngineStart () {
//                return remoteEngineStart;
//            }
//
//            public boolean isKeylessAccess () {
//                return keylessAccess;
//            }
//
//
//        }
//
//        public static class Insurance {
//            private final LocalDate validity;
//            private final double price;
//            private final String number;
//
//
//            public Insurance(LocalDate validity, double price, String number) {
//                this.validity = validity == null ? LocalDate.now().plusDays(365) : validity;
//                this.price = price;
//                this.number = number == null ? "123456789" : number;
//            }
//
//            public LocalDate getValidity() {
//                return validity;
//            }
//
//            public double getPrice() {
//                return price;
//            }
//
//            public String getNumber() {
//                return number;
//            }
//
//            public void infoValidity() {
//                if (validity.isBefore(LocalDate.now()) || validity.isEqual(LocalDate.now())) {
//                    System.out.println("нужно срочно ехать оформлять новую страховку!");
//                }
//            }
//
//            public void infoNumber() {
//                if (number.length() != 9) {
//                    System.out.println("Номер страховки некорректный!");
//                }
//            }
//    }
//
//}
//
//
//
