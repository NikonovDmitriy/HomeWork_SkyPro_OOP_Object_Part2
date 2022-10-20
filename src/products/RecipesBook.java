package products;

import java.util.HashSet;
import java.util.Set;

public class RecipesBook {

    private Set<Recipe> recipes;

    public RecipesBook() {
    }


    public void addRecipe(Recipe r) {
        if (recipes.contains(r)) {
            throw new IllegalArgumentException("Этот рецепт уже существует!");
        }
        recipes.add(r);
    }


    public Recipe getRecipeByName(String type) {
        return recipes.stream().filter(p -> p.getName().equals(type)).findAny().orElse(null);
    }


}