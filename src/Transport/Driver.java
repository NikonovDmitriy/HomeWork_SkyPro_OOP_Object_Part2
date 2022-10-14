package transport;

public class Driver<T extends Transport & Emulous> {

    private String name;
    private String driverLicense;
    private String experience;

    private String category;


    public Driver(String name, String driverLicense, String experience, String category) {
        this.setName(name);
        this.setDriverLicense(driverLicense);
        this.setExperience(experience);
        this.setCategory(category);
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        if (category == null) {
            throw new IllegalArgumentException("Необходимо указать категорию прав!");
        }
        this.category = category;
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
