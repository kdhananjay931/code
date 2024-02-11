package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class ReverseArray {
    public static void main(String[] args) {

        List<Integer> int1= Arrays.asList(12,3,4,5,6,7,8,67,96,34,2);

        int1.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);


    }
}
