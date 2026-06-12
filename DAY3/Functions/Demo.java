package DAY3.Functions;

public class Demo {
    static int Increment(int num) {
        num++;
        System.out.println("Inside Increment Function: " + num);
        return num;
    }
    public static void main(String[] args) {
        int data = 10;

        System.out.println("Before Increment: " + data);
        
        int result = Increment(data);
        
        System.out.println("After Increment: " + result);
    }
}
