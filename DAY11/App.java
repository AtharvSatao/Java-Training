package DAY11;
public class App {
    public static void main(String[] args) {
        // RestrauntService service = new RestrauntService();

        System.out.println(RestrauntService.Restrauntype);
        RestrauntService order = new BurgerKing("Whooper Burger");
        order.acceptOrder("Pankaj");
        order.PrepareFood();
        order.DeliverFood();
        
        RestrauntService order2 = new Dominos("Pizza");
        order2.acceptOrder("Atharv");
        order2.PrepareFood();
        order2.DeliverFood();

    }
}