package transport;

public class Truck extends Transport implements Emulous {

    private LoadCapacity loadCapacity;

    public Truck(String brand, String model, double engineVolume, LoadCapacity loadCapacity) {
        super(brand, model, engineVolume);
        this.loadCapacity = loadCapacity;
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
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
    public void infoType() {
        if (loadCapacity == null) {
            System.out.println("данных недостаточно");
        } else {
            String from = loadCapacity.getFrom() == null ? "" : "от " + loadCapacity.getFrom() + " ";
            String to = loadCapacity.getTo() == null ? "" : "до " + loadCapacity.getTo();
            System.out.println("Грузоподъемность авто - " + from + to);
        }

    }

    @Override
    public boolean diagnosed() {
        return Math.random() > 0.85;
    }

    @Override
    public boolean service() {
        return false;
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
