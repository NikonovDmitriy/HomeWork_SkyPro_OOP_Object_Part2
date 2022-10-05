package transport;

public class Bus extends Transport {


    public Bus(String brand, String model, Integer productionYear, String productionCountry, String color, Integer maxSpeed) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
    }

    @Override
    public void refill() {
        System.out.println("Можно заправлять бензином или дизелем на заправке!");

    }

    public void infoBus() {
        System.out.println(getBrand() + " " + getModel() + ", год выпуска " + getProductionYear()
                + ", производитель " + getProductionCountry() +
                ", цвет " + getColor() + ", максимальная скорость " + getMaxSpeed() + "км/ч);");
    }


}
