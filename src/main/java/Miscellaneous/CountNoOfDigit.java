package Miscellaneous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountNoOfDigit {
    public static void main(String[] args) {
        int i=345575668;
        String str=Integer.toString(i);


        int count=0;

        for (int j = 0; j <str.length() ; j++) {

            char ch=str.charAt(j);

            if(Character.isDigit(ch)){
                count++;

            }

        }
        System.out.println(count);
    }
}
