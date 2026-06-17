package DAY14;
import java.util.*;

public class App {
    public static void main(String[] args) {
        Map<Integer, String> employees = new HashMap<>();
        employees.put(90, "Akash");
        employees.put(101, "Oberoi");
        employees.put(102, "Dhakad");
        employees.put(104, "Sam");
        employees.put(103, "Guru");
        
        System.out.println(employees.keySet());

        for(Integer i: employees.keySet() ){
            System.out.println(employees.get(i));
        }

        System.out.println(employees.values());

        for (Map.Entry<Integer, String> entry : employees.entrySet()) {
            System.out.println(entry);
        }

        
        // System.out.println(employees);
        // System.out.println(employees.get(101));
        // System.out.println(employees.getOrDefault(99,"User Not Found"));

        // employees.putIfAbsent(104,"pam");

        // System.out.println(employees.containsKey(101));
        // System.out.println(employees.containsValue("Sam"));
        // employees.remove(101);
        // System.out.println(employees);

        // System.out.println(employees.replace(102,"Kunal"));
        // System.out.println(employees);

        // System.out.println(employees.replace(102,"Kunal", "Sunil"));
        // System.out.println(employees);
        // System.out.println(employees.size());

        // Map<Integer, String> students = new LinkedHashMap<>();
        // students.put(101, "Oberoi");
        // students.put(103, "Dhakad");
        // students.put(104, "Sam");
        // students.put(103, "Guru");
        // students.put(100, "Mann");
        // students.put(null, "null");
        // System.out.println(students);

        // Map<Integer, String> products = new TreeMap<>();
        // products.put(101, "IceCrean");
        // products.put(103, "Chips");
        // products.put(102, "ColdDrink");
        // System.out.println(products);

    }
}