package DAY10.Example1;

public class FoodOrder {
    void Order(){
        System.out.println("No Item Selected");
    }

    void Order(String name){
        System.out.println("Ordered Item:- "+ name);
    }

    void Order(String Name, int Qty){
        int price= 20;
        int total = Qty*price;

        System.out.println("Item "+Name+" Quantity "+Qty+" Total "+total);
    }

    void Order(String Name, int Qty, double Discount){
        int price= 20;
        double total = Qty*price;
        total = total - (total*Discount/100);
        System.out.println("Item "+Name+" Quantity "+Qty+" Total with Discount "+total);
    }

    void Order(String items[], int Quantity[]) {
        int grandTotal = 0;

        int price = 200;

        for (int i = 0; i < items.length; i++) {
            int bill = Quantity[i] * price;
            grandTotal += bill;

            System.out.println(items[i] + " -> " + bill);
        }

        System.out.println("Grand Total of you cart is " + grandTotal);

    }

}
