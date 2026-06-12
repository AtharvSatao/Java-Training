package DAY4;

import java.util.Scanner;

public class Zomato {

    static Scanner sc = new Scanner(System.in);

    // Food Selection
    static double orderFood() {

        System.out.println("===== MENU =====");
        System.out.println("1. Misal  - Rs.250");
        System.out.println("2. Burger - Rs.300");
        System.out.println("3. Pizza  - Rs.500");

        System.out.print("Enter Food Name: ");
        String foodName = sc.next();

        if (foodName.equalsIgnoreCase("Misal")) {
            return 250.0;
        } else if (foodName.equalsIgnoreCase("Burger")) {
            return 300.0;
        } else if (foodName.equalsIgnoreCase("Pizza")) {
            return 500.0;
        } else {
            System.out.println("Food Item Not Available!");
            return 0.0;
        }
    }

    // Restaurant Selection
    static int selectRestaurant() {

        System.out.println("\n===== RESTAURANTS =====");
        System.out.println("1. Hotel A (5 km)");
        System.out.println("2. Hotel B (12 km)");
        System.out.println("3. Hotel C (18 km)");
        System.out.println("4. Hotel D (25 km)");
        System.out.println("5. Hotel E (35 km)");

        System.out.print("Select Restaurant: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                return 5;

            case 2:
                return 12;

            case 3:
                return 18;

            case 4:
                return 25;

            case 5:
                return 35;

            default:
                System.out.println("Invalid Restaurant!");
                return 0;
        }
    }

    // Delivery Charges
    static double deliveryCharges(double foodPrice, int distance) {

        System.out.println("Food is coming from " + distance + " km.");

        if (distance > 10 && distance < 20) {
            foodPrice += distance * 2;
        } else if (distance >= 20 && distance < 30) {
            foodPrice += distance * 3;
        } else if (distance >= 30) {
            foodPrice += distance * 4;
        } else {
            System.out.println("Free Delivery!");
        }

        return foodPrice;
    }

    // Coupon
    static double applyCoupon(double amount) {

        System.out.print("Do you have a Coupon? (Y/N): ");
        char coupon = sc.next().charAt(0);

        if (coupon == 'Y' || coupon == 'y') {

            System.out.print("Enter Coupon Code: ");
            String couponValue = sc.next();

            if (couponValue.equalsIgnoreCase("IPLRCB")) {
                System.out.println("25% Discount Applied!");
                amount = amount - (amount * 0.25);
            } else {
                System.out.println("Invalid Coupon!");
            }
        }

        return amount;
    }

    // GST
    static double GST(double amount) {

        System.out.println("Adding 7% GST...");
        return amount + (amount * 0.07);
    }

    // Final Bill
    static void finalBill(double foodPrice,
                          double withDelivery,
                          double discountedAmount,
                          double finalAmount) {

        System.out.println("\n========== FINAL BILL ==========");
        System.out.printf("Food Price                : Rs. %.2f%n", foodPrice);
        System.out.printf("Price After Delivery      : Rs. %.2f%n", withDelivery);
        System.out.printf("Price After Discount      : Rs. %.2f%n", discountedAmount);
        System.out.printf("Final Amount After GST    : Rs. %.2f%n", finalAmount);
        System.out.println("================================");
    }

    public static void main(String[] args) {

        double priceOfFood = orderFood();

        if (priceOfFood == 0) {
            return;
        }

        int distance = selectRestaurant();

        double foodWithDelivery =
                deliveryCharges(priceOfFood, distance);

        double discountedAmount =
                applyCoupon(foodWithDelivery);

        double finalAmount =
                GST(discountedAmount);

        finalBill(priceOfFood,
                  foodWithDelivery,
                  discountedAmount,
                  finalAmount);
    }
}