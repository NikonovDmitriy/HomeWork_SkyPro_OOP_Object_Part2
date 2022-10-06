package transport;

public class Driver <T extends Transport & Emulous> {

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





    public void startMoving() {

    }

    public void stay() {

    }

    public void refuelCar() {

    }
}
