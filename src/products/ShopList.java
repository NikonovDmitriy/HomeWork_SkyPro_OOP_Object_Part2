package products;

import java.util.HashSet;
import java.util.Set;

public class ShopList {

    private Set<Product> set;

    public ShopList() {
        set = new HashSet<>();
    }



    public void add(Name name, double weight, double price) {
        final Product product = new Product(name, weight, price);
        if (set.contains(product)) {
            throw new IllegalArgumentException("Такой продукт уже существует!");
        }
        set.add(product);
    }


    public void markPurchased(Name name) {
        set.stream().filter(p -> p.getName() == name).findAny().ifPresent(p -> p.setPurchase(true));
    }


    public void remove(Name name) {
        final Product target;
        target = set.stream().filter(p -> p.getName() == name).findAny().orElse(null);
        set.remove(target);
    }


    public void show() {
        set.forEach(p -> {
            System.out.printf("%s, %.2f kilograms, %.2f rubbles, purchased - %b\n",
                    p.getName().getType(),
                    p.getWeight(),
                    p.getPrice(),
                    p.isPurchase());
        });
    }

}
