package transport;

public class Bus extends Transport {

    public Bus(String brand,
                     String model,
                     Integer productionYear,
                     String productionCountry,
                     String color,
                     Integer maxSpeed,
                     Integer priceTrip,
                     Integer timeTrip,
                     String nameStation,
                     String endStation,
                     Integer numberWagons) {
        super(brand, model, productionYear, productionCountry,
                color, maxSpeed, priceTrip, timeTrip, nameStation,
                endStation, numberWagons);
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.priceTrip = priceTrip;
        this.timeTrip = timeTrip;
        this.nameStation = nameStation;
        this.endStation = endStation;
        this.numberWagons = numberWagons;

    }

    @Override
    public void refill() {
        System.out.println("Можно заправлять бензином или дизелем на заправке!");

    }

    public void infoBus() {
        System.out.println(getBrand()+" "+getModel()+", год выпуска "+getProductionYear()
                +", производитель "+getProductionCountry()+
                ", цвет "+getColor()+", максимальная скорость "+getMaxSpeed()+"км/ч, цена билета "
                +getPriceTrip()+"руб, время в пути "+
                getTimeTrip()+"мин, начальная станция "+getNameStation()+", конечная станция "+getEndStation());
    }


}
