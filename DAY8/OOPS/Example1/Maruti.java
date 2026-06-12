package DAY8.OOPS.Example1;

public class Maruti {
    int Model;
    int Topspeed;
    String color;

    void StartEngine(){
        int Petrol = 3;
        System.out.println("Start");
    }

    void StopEngine(){
        System.out.println("Stop");
    }
    void drift(){
        System.out.println("Drift");
    }

    static void servewater(){
        System.out.println("Take a Water");
    }

    static void CarVarient(String Varient){
        System.out.println(Varient+" Is Available");
    }
    
    public static void main(String[] args) {
        
    }
}
