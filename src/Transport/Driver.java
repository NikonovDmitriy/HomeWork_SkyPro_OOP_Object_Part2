package transport;

public class Driver<T extends Transport & Emulous> {

    private String name;
    private String driverLicense;
    private String experience;

    public Driver(String name, String driverLicense, String experience) {
        this.setName(name);
        this.setDriverLicense(driverLicense);
        this.setExperience(experience);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null || name.isBlank() ? "noname" : name;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense == null || driverLicense.isBlank() ? "default" : driverLicense;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience == null || experience.isBlank() ? "default" : experience;
    }


    public void startMoving(T transport) {
        transport.startMoving();


    }

    public void stay(T transport) {
        transport.finishMoving();

    }

    public void refuelCar(T transport) {
        System.out.println(transport.getBrand() + " " + transport.getModel() + " заправляется топливом");

    }
}
