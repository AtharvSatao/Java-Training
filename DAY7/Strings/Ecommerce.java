package DAY7.Strings;
import java.util.Scanner;

public class Ecommerce {

    static String products[] = {"Laptop", "Mouse", "Keyboard", "Monitor", "Phone"};
    static double prices[] = {50000, 500, 1500, 12000, 30000};

    static void displayProducts() {
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i] + " = " + prices[i]);
        }
    }

    static void mostExpensive() {
        int max = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[max]) {
                max = i;
            }
        }

        System.out.println("Most Expensive Product: "
                + products[max] + " = " + prices[max]);
    }

    static void cheapestProduct() {
        int min = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < prices[min]) {
                min = i;
            }
        }

        System.out.println("Cheapest Product: "
                + products[min] + " = " + prices[min]);
    }

    static void searchProduct(String name) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].equalsIgnoreCase(name)) {
                System.out.println("Found: " + products[i] + " = " + prices[i]);
                return;
            }
        }

        System.out.println("Product Not Found");
    }

    static void totalInventory() {
        double total = 0;

        for (double price : prices) {
            total += price;
        }

        System.out.println("Total Inventory Value = " + total);
    }

    static void searchByLetter(char ch) {
        System.out.println("Products containing '" + ch + "':");

        for (String product : products) {
            if (product.toLowerCase().contains(
                    String.valueOf(Character.toLowerCase(ch)))) {
                System.out.println(product);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        displayProducts();
        mostExpensive();
        cheapestProduct();

        System.out.print("\nEnter Product Name: ");
        String name = sc.nextLine();
        searchProduct(name);

        totalInventory();

        System.out.print("\nEnter a Letter: ");
        char ch = sc.next().charAt(0);
        searchByLetter(ch);

        sc.close();
    }
}