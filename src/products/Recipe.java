package products;

import java.util.*;

public class Recipe {

    private String name;
    private double totalPrice;
    private final Map<Product, Integer> products;

    public Recipe(String name) {
        this.setName(name);
        this.totalPrice = 0;
        this.products = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public Map<Product, Integer> getProducts() {
        return Collections.unmodifiableMap(products);
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Неверное название рецепта!");
        }
        this.name = name;
    }


    public void addProduct(Product product, int count) {
        if (products.containsKey(product)) {
            throw new IllegalArgumentException("Такой продукт уже существует!");
        }
        products.put(product, count);
        totalPrice += product.getPrice() * count;
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
