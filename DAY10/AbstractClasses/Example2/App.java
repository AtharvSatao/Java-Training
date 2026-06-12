package DAY10.AbstractClasses.Example2;
public class App {
    public static void main(String[] args) {

        Employee arr[] = {
                new HR(102, "Rohit", 40000, 50000),
                new Marketing(103, "Virat", 40000, 75000),
                new Developer(104, "Atharv", 50000, 100000),
                new Developer(105, "Atharv Satao", 50000, 100000),
        };
        System.out.println(arr[2].equals(arr[3]));

        for (Employee emp : arr) {

            emp.display();
            System.out.println();
        }
    }
}