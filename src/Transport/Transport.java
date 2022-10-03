package transport;

public abstract class Transport {

    public Integer numberWagons;
    public String endStation;
    public String nameStation;
    public Integer timeTrip;
    public Integer priceTrip;
    public String brand;
    public String model;
    public Integer productionYear;
    public String productionCountry;
    public String color;
    public Integer maxSpeed;



    public Transport(String brand,
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

    public Transport(String brand,
                     String model,
                     Integer productionYear,
                     String productionCountry,
                     String color,
                     Integer maxSpeed) {

    }

    public Transport(Integer priceTrip,
                     Integer timeTrip,
                     String nameStation,
                     String endStation,
                     Integer numberWagons) {

    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Integer getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }


    public void setColor(String color) {
        this.color = color == null || color.isBlank() ? "значение указано некорректно!" : color;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed <= 0 ? 0 : maxSpeed;
    }

}
