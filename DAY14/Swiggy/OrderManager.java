package DAY14.Swiggy;

import java.util.*;

public class OrderManager {

    HashMap<Integer, Customer> customers = new HashMap<>();

    ArrayList<Order> orders = new ArrayList<>();

    public void addCustomer(Customer customer) {

        customers.put(customer.getId(), customer);

        System.out.println("Customer Added");
    }

    public void addOrder(Order order) {

        if(customers.containsKey( order.getCustomerId())) {

            orders.add(order);

            System.out.println("Order Added");
        }
        else {
            System.out.println("Customer Does Not Exist");
        }
    }

    public void displayCustomers() {
        if(customers.isEmpty()){
            System.out.println("Order is Empty");
        }
        for(Customer c : customers.values()) {
            System.out.println(c);
        }
    }

    public void displayAllOrders() {

        for(Order o : orders) {
            System.out.println(o);
        }
    }

    public void displayOrdersForCustomer(int customerId) {
        
        for(Order o : orders) {

            if(o.getCustomerId() == customerId) {
                System.out.println(o);
            }
        }
    }

    public void calculateTotalSpending(int customerId) {

        double total = 0;

        for(Order o : orders) {

            if(o.getCustomerId() == customerId) {

                total += o.getAmount();
            }
        }

        System.out.println("Total Spending = " + total);
    }

    public void highestSpendingCustomer() {

        double max = 0;
        int customerId = -1;

        for(Customer c : customers.values()) {

            double total = 0;

            for(Order o : orders) {

                if(o.getCustomerId()
                        == c.getId()) {

                    total += o.getAmount();
                }
            }

            if(total > max) {
                max = total;
                customerId = c.getId();
            }
        }

        System.out.println(customers.get(customerId));
        System.out.println("Total Spending = " + max);
    }

    public void removeCustomer(int customerId) {

        customers.remove(customerId);

        Iterator<Order> itr = orders.iterator();

        while(itr.hasNext()) {

            Order o = itr.next();

            if(o.getCustomerId() == customerId) {

                itr.remove();
            }
        }
        System.out.println("Customer And Orders Removed");
    }
}