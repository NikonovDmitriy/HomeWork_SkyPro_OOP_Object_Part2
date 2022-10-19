package products;


import java.util.List;


public class Main {

    public static void main(String[] args) {


        Product potatoes = new Product("Картошка", 20.0, 1.0);
        Product carrot = new Product("Морковь", 15.0, 1.0);
        Product cabbage = new Product("Капуста", 16.0, 1.0);
        Product beet = new Product("Свекла", 17.0, 1.0);
        Product radish = new Product("Редиска", 18.0, 1.0);
        Product buckwheat = new Product("Гречка", 19.0, 1.0);
        Product rice = new Product("Рис", 21.0, 1.0);
        Product qiwi = new Product("Киви", 22.0, 1.0);
        Product grape = new Product("Виноград", 24.0, 1.0);
        Product dates = new Product("Финики", 24.0, 1.0);
        Product carrot1 = new Product("Морковь", 15.0, 1.0);


        List<Product> products = List.of(potatoes, carrot, cabbage, beet, radish, buckwheat, rice, qiwi, grape, dates, carrot1);





    }
}
