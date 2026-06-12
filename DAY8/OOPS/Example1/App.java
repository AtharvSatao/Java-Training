package DAY8.OOPS.Example1;

public class App {
    public static void main(String[] args) {
        
        Maruti Baleno = new Maruti();

        Baleno.Topspeed =150;
        Baleno.Model= 2026;
        Baleno.color = "Blue";

        System.out.println(Baleno.Topspeed +" "+Baleno.Model+" "+ Baleno.color);

        Baleno.StartEngine();
        Baleno.StopEngine();
        Baleno.drift();

        String Varient = "vxi";
        Baleno.CarVarient(Varient);

        System.out.println(Varient);

        // Maruti Breeza = new Maruti();

        // Breeza.Topspeed =130;
        // Breeza.Model= 2025;
        // Breeza.color = "White";

        // System.out.println(Breeza.Topspeed +" "+Breeza.Model+" "+ Breeza.color);

        // Breeza.StartEngine();
        // Breeza.StopEngine();
        // Breeza.drift();

        Maruti.servewater();


    }
}
