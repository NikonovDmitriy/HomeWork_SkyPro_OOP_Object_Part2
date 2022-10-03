package transport;

public class Train extends Transport {

    private Integer priceTrip;
    private Integer timeTrip;
    private String nameStation;
    private String endStation;
    private Integer numberWagons;

        public Train(String brand,
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


    public Integer getPriceTrip() {
        return priceTrip;
    }

    public void setPriceTrip(Integer priceTrip) {
        this.priceTrip = priceTrip <= 0 ? 0 : priceTrip;
    }

    public Integer getTimeTrip() {
        return timeTrip;
    }

    public void setTimeTrip(Integer timeTrip) {
        this.timeTrip = timeTrip <= 0 ? 0 : timeTrip;
    }

    public String getNameStation() {
        return nameStation;
    }

    public void setNameStation(String nameStation) {
        this.nameStation = nameStation == null || nameStation.isBlank() ? "default" : nameStation;
    }

    public String getEndStation() {
        return endStation;
    }

    @Override
    public void refill() {
        System.out.println("Нужно заправлять дизелем!");

    }

    public void setEndStation(String endStation) {
        this.endStation = endStation == null || endStation.isBlank() ? "default" : endStation;
    }

    public Integer getNumberWagons() {
        return numberWagons;
    }

    public void setNumberWagons(Integer numberWagons) {
        this.numberWagons = numberWagons <= 0 ? 0 : numberWagons;
    }


    public void infoTrain() {
        System.out.println(getBrand()+", модель "+getModel()+", год выпуска "+getProductionYear()+", страна-производитель - "+
                getProductionCountry()+", скорость передвижения - "+getMaxSpeed()+"км/ч, начальная станция - "+getNameStation()+", " +
                "конечная станция - "+getEndStation()+". Цена поездки - "+getPriceTrip()+"руб, в поезде "+getNumberWagons()+" вагонов.");
    }
}
