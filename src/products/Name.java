package products;

public enum Name {

    GRAPE("Grape"),
    APPLE("Apple"),
    ORANGE("Orange");

    private final String type;

    Name(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
