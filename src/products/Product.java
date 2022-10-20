package products;

public class Product {

    private final Name name;
    private double weight;
    private double price;
    private boolean purchase;

    public Product(Name name, double weight, double price) {
        this.name = name;
        this.setWeight(weight);
        this.setPrice(price);
        purchase = false;
    }

    public Name getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public boolean isPurchase() {
        return purchase;
    }

    public void setWeight(double weight) {
        this.weight = Math.max(weight, 0);
    }

    public void setPrice(double price) {
        this.price = Math.max(price, 0);
    }

    public void setPurchase(boolean purchase) {
        this.purchase = purchase;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        return name == product.name;
    }



    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }



}













