package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfChar {
    public static void main(String[] args) {
        String str="My name is Dhananjay";

        Map<Character ,Long> freq= str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(freq);
    }
}
