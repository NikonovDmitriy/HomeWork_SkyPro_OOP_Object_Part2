package transport;

public class Truck extends Transport implements Emulous {

    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("старт грузового авто");

    }

    @Override
    public void finishMoving() {
        System.out.println("финиш грузового авто");

    }

    @Override
    public void pitStop() {
        System.out.println("пит-стоп как у грузового авто");

    }

    @Override
    public void maxSpeed() {
        System.out.println("максимальная скорость грузового авто 150км/ч");

    }

    @Override
    public void bestTime() {
        System.out.println("лучшее время круга грузового авто 3 минуты");

    }
}
