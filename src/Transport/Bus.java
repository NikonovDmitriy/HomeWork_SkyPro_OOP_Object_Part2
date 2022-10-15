package transport;

public class Bus extends Transport implements Emulous {

    private Capacity capacity;

    public Bus(String brand, String model, double engineVolume, Capacity capacity) {
        super(brand, model, engineVolume);
        this.capacity = capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
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
    public void infoType() {
        if (capacity == null) {
            System.out.println("данных недостаточно");
        } else {
            System.out.println("Вместимость автобуса от" + capacity.getFrom() + " до " + capacity.getTo());
        }

    }

    @Override
    public boolean diagnosed() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " в диагностике не нуждается");
        return true;
    }

    @Override
    public boolean service() {
        return false;
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

    @Override
    public void repair() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " отремонтирован!");
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
