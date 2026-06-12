package DAY4.Recursion;
public class LargestDigit {
    static int largest(int n){
        if(n<10){
            return n;
        } 
        int lastDigit = n % 10;
        int largestInRemaining = largest(n / 10);
        return Math.max(lastDigit, largestInRemaining);
    }
    
    public static void main(String[] args) {
        int number=1286;
        int result= largest(number);
        System.out.println("Largest Digit is:- " + result);
    }
}