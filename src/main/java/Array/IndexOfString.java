package Array;

import java.util.Arrays;

public class IndexOfString {

    public static void main(String[] args) {
        String haystack = "leetcode";
        String needle = "leeto";
        System.out.println(Arrays.toString(new int[]{findindex(haystack, needle)}));
    }
    static int findindex(String haystack, String needle){
        int lh=haystack.length();
        int ln=needle.length();

        for (int i = 0; i+ln <=lh ; i++) {
            if(haystack.substring(i,i+ln).equals(needle)){
                return i;
            }

        }


       return -1;
    }
}
