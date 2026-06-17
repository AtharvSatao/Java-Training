package DAY14.Swiggy;
public class App {

    public static void main(String[] args) {

        OrderManager service = new OrderManager();
        service.addCustomer(new Customer(101, "Rahul", "rahul@gmail.com"));
        service.addCustomer(new Customer( 102, "Amit", "amit@gmail.com"));
        service.addOrder(new Order(1, 101, "Burger", 200));
        service.addOrder(new Order(2, 101, "Pizza", 500));
        service.addOrder(new Order(3, 102, "Cold Drink", 100));

        System.out.println("\nCustomers");
        service.displayCustomers();

        System.out.println("\nOrders");
        service.displayAllOrders();

        System.out.println("\nOrders Of Customer 101");
        service.displayOrdersForCustomer(101);

        System.out.println("\nTotal Spending");
        service.calculateTotalSpending(101);

        System.out.println("\nHighest Spending Customer");
        service.highestSpendingCustomer();

        System.out.println("\nRemove Customer");
        service.removeCustomer(101);

        System.out.println("\nRemaining Orders");
        service.displayAllOrders();
    }
}