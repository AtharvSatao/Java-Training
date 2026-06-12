package DAY4;

import java.util.Scanner;

public class Cab {
    static int calFare(String cabType, int travelDist, int time) {

        if (cabType.equalsIgnoreCase("Car")) {
            return travelDist * 10;
        }
        else if (cabType.equalsIgnoreCase("Bike")) {
            return travelDist * 15;
        }
        else if (cabType.equalsIgnoreCase("Rental")) {

            if (time == 1) {
                return travelDist * 28;
            }
            else if (time == 2) {
                return travelDist * 30;
            }
            else if (time == 3) {
                return travelDist * 35;
            }
            else {
                return travelDist * 40;
            }
        }
        else {
            System.out.println("Invalid Cab Type");
            return 0;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Cab Type (Car/Bike/Rental): ");
        String cabType = sc.next();

        System.out.print("Enter Travel Distance (km): ");
        int distance = sc.nextInt();

        int time = 0;

        if (cabType.equalsIgnoreCase("Rental")) {
            System.out.print("Enter Rental Time (1/2/3/4+ hours): ");
            time = sc.nextInt();
        }

        int fare = calFare(cabType, distance, time);
        System.out.println("Total Fare = Rs. " + fare);

        sc.close();
    }
}