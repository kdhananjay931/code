package Miscellaneous;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LengthOfString {
    public static void main(String[] args) {
        List<String> str= Arrays.asList("ram","hari","james","Tiredness");

//        for(String count:str){
//             if(count.length()>4){
//                 System.out.println(count);
//             }
//        }
//        System.out.println(str);

        List<String> collect = str.stream().filter(s -> s.length() > 4).collect(Collectors.toList());

        System.out.println(collect);
    }
}
