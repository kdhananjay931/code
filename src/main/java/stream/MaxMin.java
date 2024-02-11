package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxMin {
    public static void main(String[] args) {
        List<Integer> arr= Arrays.asList(45,6,4,3,4,78);

        int max=arr.stream().max(Comparator.naturalOrder()).get();
        int min=arr.stream().min(Comparator.naturalOrder()).get();

        System.out.println(max);
        System.out.println(min);
    }

}
