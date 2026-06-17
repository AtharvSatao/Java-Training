package DAY14;
import java.util.*;

public class Array {
    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>(
                Arrays.asList(2, 5, 1, 6, 2, 5, 1, 6, 8, 1, 1)
        );

        Map<Integer, Integer> freq = new HashMap<>();

        for(Integer num : arr){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        System.out.println(freq);
    }
}
