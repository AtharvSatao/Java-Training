package DAY4.Recursion;
public class DigitCount {
    static int count(int n){
        if(n==0){
            return 0;
        }
        else{
            return 1 + count(n/10);
        }
    }
    public static void main(String[]args){
        int number=1234;
        int result=count(number);
        System.out.println("Count is: " + result);
    }
}
