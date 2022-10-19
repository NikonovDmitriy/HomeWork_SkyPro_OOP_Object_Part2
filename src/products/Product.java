package products;

import java.util.HashSet;
import java.util.Set;

public class Product {

    private String name;
    private double price;
    private double amount;


    public Product(String name, double price, double amount) {
        this.setName(name);
        this.setPrice(price);
        this.setAmount(amount);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null || name.isBlank() ? "default" : name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;

    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }


    private static Set<Product> productList = new HashSet<>();

    public static Set<Product> getProductList() {
        return productList;
    }

    public static void addProduct(Product name) throws Exception{
        if (name.getName() == null || name.getPrice() == 0 || name.getAmount() == 0) {
            throw new Exception("Заполните карточку товара полностью!");
        }
        if (!productList.contains(name)) {
            productList.add(name);
        }else {
            throw new Exception("Продукт " + name + " уже есть в корзине");
        }
    }
}















