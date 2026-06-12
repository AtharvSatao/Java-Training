package DAY4.Recursion;

public class Expotential {
    static int exp(int x, int power) {
        if(power==0){
            return 1;
        }
        else{
            return x * exp(x, power-1);
        }
    }
    public static void main(String[] args){
        int x=5;
        int Power=2;
        int result = exp(x,Power);
        System.out.println(result);
    }
}

