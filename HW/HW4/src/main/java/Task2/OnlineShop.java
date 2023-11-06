package Task2;

import java.util.ArrayList;
import java.util.List;

public class OnlineShop {
    private static List<Buyer> buyers = new ArrayList<>();
    private static List<Product> products = new ArrayList<>();
    private static List<Order> orders = new ArrayList<>();

    public static void main(String[] args) {
        // Создание массива покупателей
        createBuyers();

        // Создание массива товаров
        createProducts();

        // Вызов метода совершения покупки несколько раз
        try {
            Order order1 = makePurchase("John", "Laptop", 2);
            orders.add(order1);

            Order order2 = makePurchase("Alice", "Headphones", 1);
            orders.add(order2);

            Order order3 = makePurchase("Bob", "Smartphone", -1);  // Количество товара отрицательное, выбросится исключение
            orders.add(order3);  // Эта строка не выполнится из-за исключения

            Order order4 = makePurchase("David", "Monitor", 3);  // Несуществующий покупатель, выбросится исключение
            orders.add(order4);  // Эта строка не выполнится из-за исключения
        } catch (Exception e) {
            System.out.println("Ошибка при совершении покупки: " + e.getMessage());
        }

        // Вывод итогового количества совершённых покупок
        System.out.println("Итоговое количество совершённых покупок: " + orders.size());
    }

    private static void createBuyers() {
        buyers.add(new Buyer("John"));
        buyers.add(new Buyer("Alice"));
        buyers.add(new Buyer("Bob"));
    }

    private static void createProducts() {
        products.add(new Product("Laptop", 1000));
        products.add(new Product("Smartphone", 800));
        products.add(new Product("Headphones", 100));
        products.add(new Product("Monitor", 500));
    }

    private static Order makePurchase(String buyerName, String productName, int quantity) throws Exception {
        Buyer buyer = findBuyerByName(buyerName);
        Product product = findProductByName(productName);

        if (buyer == null) {
            throw new Exception("Указанный покупатель не существует");
        }

        if (product == null) {
            throw new Exception("Указанный товар не существует");
        }

        if (quantity <= 0) {
            throw new Exception("Количество товара должно быть положительным");
        }

        return new Order(buyer, product, quantity);
    }

    private static Buyer findBuyerByName(String name) {
        for (Buyer buyer : buyers) {
            if (buyer.getName().equals(name)) {
                return buyer;
            }
        }
        return null;
    }

    private static Product findProductByName(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }
}
