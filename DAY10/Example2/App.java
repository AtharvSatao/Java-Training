package DAY10.Example2;

public class App {
    public static void main(String[] args) {

        Parking vehicles[] = {
                new Car(),
                new Bike(),
                new Truck(),
                new Car(),
                new Bike(),
                new Car()
        };

        int bike = 0;
        int truck = 0;
        int car = 0;
        int countOfBike = 0;
        int countOfCar = 0;
        int countOfTruck = 0;

        int totalToll = 0;

        for (Parking v : vehicles) {
            if (v instanceof Car) {
                Car temp = new Car();
                car = car + temp.toll();
                countOfCar++;
            } else if (v instanceof Bike) {
                Bike temp2 = new Bike();
                bike = bike + temp2.toll();
                countOfBike++;
            } else if (v instanceof Truck) {
                Truck temp3 = new Truck();
                truck = truck + temp3.toll();
                countOfTruck++;
            }

        }

        System.out.println("Ajj ka total toll " + (bike + car + truck));

        System.out.println("Total Cars " + countOfCar + " and total was " + car);
        System.out.println("Total Bike " + countOfBike + " and total was " + bike);
        System.out.println("Total Trucks " + countOfTruck + " and total was " + truck);

    }
}