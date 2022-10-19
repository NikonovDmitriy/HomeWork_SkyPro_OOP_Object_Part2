package products;

import java.util.HashSet;
import java.util.Set;

public class Recipe {

    private Set<Product> products = new HashSet<>();
    private int sumOfRecipe;
    private String nameOfRecipe;


    public Recipe(Set<Product> products,
                  int sumOfRecipe,
                  String nameOfRecipe) {
        this.products.addAll(products);
        this.sumOfRecipe = sumOfRecipe;
        this.nameOfRecipe = nameOfRecipe;
    }

    private static Set<Recipe> recipes = new HashSet<>();

}

