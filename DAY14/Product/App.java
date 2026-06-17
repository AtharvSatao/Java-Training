package DAY14.Product;
import java.util.*;

public class App {

    public static void main(String[] args) {

        Map<Integer, Product> products = new HashMap<>();

        products.put(101,
                new Product("Laptop", 55000));

        products.put(102,
                new Product("Mouse", 500));

        products.put(103,
                new Product("Keyboard", 1200));

        products.put(104,
                new Product("Monitor", 10000));

        System.out.println(products.keySet());

        for(Integer id : products.keySet()) {
            System.out.println(products.get(id));
        }

        System.out.println(products.values());

        for(Map.Entry<Integer, Product> entry
                : products.entrySet()) {

            System.out.println(
                    entry.getKey() +" "+entry.getValue()
            );
        }
    }
}