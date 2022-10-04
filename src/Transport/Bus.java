package transport;

public class Bus extends Transport {

    public String nameStation;
    public String endStation;

    public Integer priceTrip;
    public Integer timeTrip;

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
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
        this.setBrand(brand);
        this.setModel(model);
        this.setProductionYear(productionYear);
        this.setProductionCountry(productionCountry);
        this.setColor(color);
        this.setMaxSpeed(maxSpeed);
        this.setPriceTrip(priceTrip);
        this.setTimeTrip(timeTrip);
        this.setNameStation(nameStation);
        this.setEndStation(endStation);

    }

    public String getNameStation() {
        return nameStation;
    }

    public void setNameStation(String nameStation) {
        this.nameStation = nameStation;
    }

    public String getEndStation() {
        return endStation;
    }

    public void setEndStation(String endStation) {
        this.endStation = endStation;
    }

    public Integer getPriceTrip() {
        return priceTrip;
    }

    public void setPriceTrip(Integer priceTrip) {
        this.priceTrip = priceTrip;
    }

    public Integer getTimeTrip() {
        return timeTrip;
    }

    public void setTimeTrip(Integer timeTrip) {
        this.timeTrip = timeTrip;
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
