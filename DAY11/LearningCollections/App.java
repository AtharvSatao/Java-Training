package DAY11.LearningCollections;
import java.util.*;

public class App {
    public static void main(String[] args) {
        List<String>Students = new ArrayList<String>();
        System.out.println(Students);

        Students.add("a");
        Students.add("b");
        Students.add("c");
        Students.add("d");
        Students.add("e");
        System.out.println(Students);

        for(String st: Students){
            if(st == "B"){
                System.out.print("Element Found at:- ");
            }
        }
        System.out.println(Students.indexOf("b"));

        Students.add(3, "f");
        System.out.println(Students);
        System.out.println(Students.get(3));
        Students.set(3, "z");
        System.out.println(Students);

        Students.remove("a");
        System.out.println(Students);

        System.out.println(Students.contains("c"));

        System.out.println(Students.size());

        //Students.clear();
        System.out.println(Students.isEmpty());

        Collections.sort(Students);
        System.out.println(Students);

        Collections.reverse(Students);
        System.out.println(Students);

        Students.addLast("x");
        System.out.println(Students);
    }
}