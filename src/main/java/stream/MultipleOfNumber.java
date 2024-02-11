package stream;

import java.util.Arrays;
import java.util.List;

public class MultipleOfNumber {
    public static void main(String[] args) {

        List<Integer> int1= Arrays.asList(20,21,3,4,54,60,65,75,80);
        int1.stream().filter(i->i%5==0).forEach(System.out::println);
    }
}
