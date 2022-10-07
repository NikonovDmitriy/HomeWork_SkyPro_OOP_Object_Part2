package transport;

public class Bus extends Transport implements Emulous {

    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("автобусный старт");

    }

    @Override
    public void finishMoving() {
        System.out.println("автобусный финиш");

    }

    @Override
    public void pitStop() {
        System.out.println("пит-стоп как у автобуса");

    }

    @Override
    public void maxSpeed() {

        System.out.println("максимальная скорость автобуса 145км/ч");

    }

    @Override
    public void bestTime() {
        System.out.println("лучшее время круга автобуса 4 минуты");

    }
}

//
//
//    public Bus(String brand, String model, Integer productionYear, String productionCountry, String color, Integer maxSpeed) {
//        super(brand, model, productionYear, productionCountry, color, maxSpeed);
//    }
//
//    @Override
//    public void refill() {
//        System.out.println("Можно заправлять бензином или дизелем на заправке!");
//
//    }
//
//    public void infoBus() {
//        System.out.println(getBrand() + " " + getModel() + ", год выпуска " + getProductionYear()
//                + ", производитель " + getProductionCountry() +
//                ", цвет " + getColor() + ", максимальная скорость " + getMaxSpeed() + "км/ч);");
//    }
//
//
//}
