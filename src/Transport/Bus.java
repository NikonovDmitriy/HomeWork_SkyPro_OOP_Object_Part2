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

    public void infoBus() {
        System.out.println(brand+" "+model+", год выпуска "+productionYear+", производитель "+productionCountry+
                ", цвет "+color+", максимальная скорость "+maxSpeed+"км/ч, цена билета "+priceTrip+"руб, время в пути "+
                timeTrip+"мин, начальная станция "+nameStation+", конечная станция "+endStation);
    }


}
