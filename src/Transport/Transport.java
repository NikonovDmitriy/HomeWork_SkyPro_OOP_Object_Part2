package transport;

public abstract class Transport {

    private String brand;
    private String model;
    private double engineVolume;


    public Transport(String brand, String model, double engineVolume) {
        this.setBrand(brand);
        this.setModel(model);
        this.setEngineVolume(engineVolume);
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null || brand.isBlank() ? "default" : brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null || model.isBlank() ? "default" : model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume == 0 || engineVolume < 0 ? 0 : engineVolume;
    }

    public abstract void startMoving();

    public abstract void finishMoving();

    public abstract void infoType();
}
//    private Integer productionYear;
//    private String productionCountry;
//    private String color;
//    private Integer maxSpeed;



//    public Transport(String brand,
//                     String model,
//                     Integer productionYear,
//                     String productionCountry,
//                     String color,
//                     Integer maxSpeed) {
//        this.setBrand(brand);
//        this.setModel(model);
//        this.setProductionYear(productionYear);
//        this.setProductionCountry(productionCountry);
//        this.setColor(color);
//        this.setMaxSpeed(maxSpeed);
//
//
//    }
//
//
//
//
//
//
//    public String getBrand() {
//        return brand;
//    }
//
//    public String getModel() {
//        return model;
//    }
//
//    public Integer getProductionYear() {
//        return productionYear;
//    }
//
//    public String getProductionCountry() {
//        return productionCountry;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public Integer getMaxSpeed() {
//        return maxSpeed;
//    }
//
//
//
//    public void setColor(String color) {
//        this.color = color == null || color.isBlank() ? "значение указано некорректно!" : color;
//    }
//
//    public void setMaxSpeed(Integer maxSpeed) {
//        this.maxSpeed = maxSpeed <= 0 ? 0 : maxSpeed;
//    }
//
//    public void setBrand(String brand) {
//        this.brand = brand == null || brand.isBlank() ? "default" : brand;
//    }
//
//    public void setModel(String model) {
//        this.model = model == null || model.isBlank() ? "default" : model;
//    }
//
//    public void setProductionYear(Integer productionYear) {
//        this.productionYear = productionYear == null ? 2000 : productionYear;
//    }
//
//    public void setProductionCountry(String productionCountry) {
//        this.productionCountry = productionCountry == null ? "default" : productionCountry;
//    }
//
//
//
//
//    public abstract void refill();
//
//
//}
