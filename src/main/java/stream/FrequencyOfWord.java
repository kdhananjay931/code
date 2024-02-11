package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfWord {
    public static void main(String[] args) {

        List<String> word= Arrays.asList("Dhananjay", "Ram", "Ram","Shyama");

        Map<String ,Long> freq=word.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(freq);
    }
}
