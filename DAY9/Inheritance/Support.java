package DAY9.Inheritance;

public class Support extends Teacher{
    boolean Uniform;
    int Problems;

    Support(int ID, String Name, String Email, int exp, String degree, boolean Uniform, int Problems){
        super(ID, Name, Email, exp, degree);
        this.Uniform = Uniform;
        this.Problems= Problems;

        System.out.println("I am Support Constructor");
    
    }
}
