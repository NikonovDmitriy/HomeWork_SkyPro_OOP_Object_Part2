package products;


import java.util.List;


public class Main {

    public static void main(String[] args) {

        var shopList = new ShopList();

        shopList.add(Name.APPLE, 1.5, 11.2);
        shopList.add(Name.ORANGE, 2.5, 13.4);
        shopList.add(Name.GRAPE, 3.4, 15.6);

        shopList.markPurchased(Name.APPLE);
        shopList.show();

        System.out.println();
        shopList.remove(Name.APPLE);
        shopList.show();


        var recipesBook = new RecipesBook();

        var recipe = new Recipe("первй рецепт");
        recipe.addProduct(new Product(Name.APPLE, 1.2, 15.5));
        recipe.addProduct(new Product(Name.GRAPE, 1.5, 16.7));
        recipesBook.addRecipe(recipe);

    }
}
