package DAY11;

    public class Dominos implements RestrauntService {

    String FoodItem;

    Dominos(String FoodItem) {
        this.FoodItem = FoodItem;
    }

    @Override
    public void acceptOrder(String CustomerName) {
        System.out.println("Hello " + CustomerName + " your order is accepted!!");
    }

    @Override
    public void PrepareFood() {
        System.out.println("Preparing your Pizza with double cheese");
        System.out.println("Free choco lava cakes");
    }

    @Override
    public void DeliverFood() {
        System.out.println("We will deliver your food by bike in 45 mins");
    }

}

