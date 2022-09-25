public class Car {

    String brand;
    String model;
    double engineVolume;
    String color;
    Integer productionYear;
    String productionCountry;

    Car(String brand, String model, Integer productionYear, String productionCountry, String color, double engineVolume) {

        if(brand==null){
            this.brand = "default";
        }else {
            this.brand = brand;
        }

        if(model==null){
            this.model = "default";
        }else {
            this.model = model;
        }

        if(productionYear==null){
            this.productionYear = 2000;
        }else {
            this.productionYear = productionYear;
        }

        if(productionCountry==null){
            this.productionCountry = "default";
        }else {
            this.productionCountry = productionCountry;
        }

        if(color==null){
            this.color = "белый";
        }
        this.color = color;

        if(engineVolume==0){
            this.engineVolume = 1.5;
        }else {
            this.engineVolume = engineVolume;
        }
    }


    void infoCar() {
        System.out.println(brand +" "+ model+", " + productionYear + " год выпуска, страна сборки " + productionCountry+", " + color + " цвет, объем двигателя - " + engineVolume);
    }
}
