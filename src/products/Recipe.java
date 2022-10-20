package products;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recipe {

    private String name;
    private double totalPrice;
    private Set<Product> products;

    public Recipe(String name) {
        this.setName(name);
        this.totalPrice = 0;
        this.products = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Неверное название рецепта!");
        }
        this.name = name;
    }


    public void addProduct(Product product) {
        if (products.contains(product)) {
            throw new IllegalArgumentException("Такой продукт уже существует!");
        }
        products.add(product);
        totalPrice+= product.getPrice();
    }


    @Override
    public boolean equals(Object o) {
        if(this==o) return true;
        if(o==null||getClass()!=o.getClass()) return false;

        Recipe recipe = (Recipe) o;

        if(Double.compare(recipe.totalPrice, totalPrice)!=0) return false;
        if(!Objects.equals(name, recipe.name)) return false;
        return Objects.equals(products, recipe.products);

    }


    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(totalPrice);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (products != null ? products.hashCode() : 0);
        return result;
    }
}
