package Array;

import java.util.Arrays;

public class ReverseWord {

    public static String reverse(String s) {
        String[] word = s.split(" ");
        String result = "";

        for (int i = word.length - 1; i >= 0; i--) {
            if (i == 0) {
                result = result + word[i];
            } else {
                result = result + word[i] + " ";
            }

        }
        return result;
    }

    public static void main(String[] args) {
        String s = " Hello World";
        System.out.println(reverse(s));

    }
}
