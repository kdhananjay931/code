package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ThreeMaxMin {
    public static void main(String[] args) {

        List<Integer> maxthree= Arrays.asList(34,56,78,20,21,3,5,6,7,8);

        maxthree.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);

    }
}
