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
                 Integer priceTrip,
                 Integer timeTrip,
                 String nameStation,
                 String endStation,
                 Integer numberWagons,
                 Integer maxSpeed) {
        super(priceTrip, timeTrip, nameStation, endStation, numberWagons);
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
        System.out.println(brand+"модель "+model+productionYear+" год выпуска, страна "+productionCountry+
                "скорость передвижения - "+maxSpeed+", начальная станция "+nameStation+", конечная станция "+
                endStation+". Цена поездки "+priceTrip+", в поезде "+numberWagons+" вагонов.");
    }
}
