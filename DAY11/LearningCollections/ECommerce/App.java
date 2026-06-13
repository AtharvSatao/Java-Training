package DAY11.LearningCollections.ECommerce;
import java.util.*;

public class App {
    public static void main(String[] args) {
        ShoppingCart cartList = new ShoppingCart();

        cartList.AddProduct(new Product(101, "Shirt", 1200, "Clothing"));
        cartList.AddProduct(new Product(102, "Pant", 1500, "Clothing"));
        cartList.AddProduct(new Product(103, "Laptop", 50000, "Electronics"));
        cartList.AddProduct(new Product(105, "Milk", 30, "Food"));
        cartList.AddProduct(new Product(109, "Waffers", 70, "Food"));
        cartList.showProductDetails();

        System.out.println("Search for a Product");
        System.out.println(cartList.searchProduct(105));
        System.out.println("Update a item name in my cart");

        cartList.UpdateProductName(109, "Waffer chips");
        cartList.showProductDetails();

        System.out.println("Remove a item");
        System.out.println(cartList.removeProduct(105));

        cartList.showProductDetails();

        System.out.println("=========Sorting===========");
        cartList.SortmyProducts();
        cartList.showProductDetails();

    }
}