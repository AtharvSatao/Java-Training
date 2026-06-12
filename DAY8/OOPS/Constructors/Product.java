package DAY8.OOPS.Constructors;

public class Product {
    String name;        //Instance Variable
    int price;          //Instance Variable

    Product(String name, int price){
        this.name=name;
        this.price=price;
    }
    Product(Product otheProduct){
        this.name=otheProduct.name;
        this.price=otheProduct.price;
    }

}
