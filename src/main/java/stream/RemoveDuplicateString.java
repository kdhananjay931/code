package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateString {
    public static void main(String[] args) {
        List<String > str= Arrays.asList("java", "java","c","Hindi","English", "c");

        List<String> dupl=str.stream().distinct().collect(Collectors.toList());
        System.out.println(dupl);
    }
}
