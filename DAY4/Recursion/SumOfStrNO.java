package DAY4.Recursion;
public class SumOfStrNO {
    static int sum(int n){
        if(n==0){
            return 0;
        }
        else{
            int rem = (n%10);
            return rem + sum(n/10);
        }
    }
    public static void main(String[] args) {
        int digits=1234;
        int result = sum(digits);
        System.out.println("The sum is: " + result);
    }
}