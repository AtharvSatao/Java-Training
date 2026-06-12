package DAY4;

import java.util.Scanner;

public class OrderFood {

    static double foodPrice(String foodName) {

        if (foodName.equalsIgnoreCase("Misal")) {
            return 150;
        } else if (foodName.equalsIgnoreCase("PavBhaji")) {
            return 200;
        } else if (foodName.equalsIgnoreCase("Pasta")) {
            return 210;
        } else if (foodName.equalsIgnoreCase("Bhel")) {
            return 100;
        } else {
            System.out.println("Invalid Food Item!");
            return 0;
        }
    }

    static double deliveryCharge(int distance) {

        if (distance <= 5) {
            System.out.println("Free Delivery!!!");
            return 0;
        } else if (distance <= 10) {
            return distance * 15;
        } else if (distance <= 20) {
            return distance * 20;
        } else {
            return distance * 30;
        }
    }

    static double couponDiscount(double amount, String couponCode) {

        if (couponCode.equalsIgnoreCase("SAVE10")) {
            return amount * 0.10; // 10% Discount
        }

        System.out.println("Invalid Coupon Code!");
        return 0;
    }

    static double gst(double foodPrice) {
        return foodPrice * 0.07; // GST only on food
    }

    static double finalAmount(double foodPrice, double deliveryCharge, double discount) {

        double gstAmount = gst(foodPrice);

        return foodPrice + deliveryCharge + gstAmount - discount;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== FOOD MENU =====");
        System.out.println("Misal     - Rs.150");
        System.out.println("PavBhaji  - Rs.200");
        System.out.println("Pasta     - Rs.210");
        System.out.println("Bhel      - Rs.100");

        System.out.print("Enter Food Name: ");
        String foodName = sc.next();

        double foodPrice = foodPrice(foodName);

        if (foodPrice == 0) {
            sc.close();
            return;
        }

        System.out.print("Enter Distance (km): ");
        int distance = sc.nextInt();

        double delivery = deliveryCharge(distance);

        double amount = foodPrice + delivery;

        double discount = 0;

        System.out.print("Do you have a coupon? (YES/NO): ");
        String hasCoupon = sc.next();

        if (hasCoupon.equalsIgnoreCase("YES")) {

            System.out.print("Enter Coupon Code: ");
            String couponCode = sc.next();

            discount = couponDiscount(amount, couponCode);
        }

        double gstAmount = gst(foodPrice);

        double finalBill = finalAmount(foodPrice, delivery, discount);

        System.out.println("\n========== BILL ==========");
        System.out.println("Food Item       : " + foodName);
        System.out.println("Food Price      : Rs. " + foodPrice);
        System.out.println("Delivery Charge : Rs. " + delivery);
        System.out.println("Discount        : Rs. " + discount);
        System.out.println("GST (7%)        : Rs. " + gstAmount);
        System.out.println("--------------------------");
        System.out.println("Final Amount    : Rs. " + finalBill);
        System.out.println("==========================");

        sc.close();
    }
}