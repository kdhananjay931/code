package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OddEven {
    public static void main(String[] args) {
        List<Integer> oddeven= Arrays.asList(3,4,5,6,7,8,9);

        Map<Boolean ,List<Integer>> evenodd=oddeven.stream().collect(Collectors.partitioningBy(i->i%2==0));

        System.out.println(evenodd) ;
    }
}
