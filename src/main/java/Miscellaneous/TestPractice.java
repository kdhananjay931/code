package Miscellaneous;

import java.util.LinkedList;
import java.util.Stack;

public class TestPractice {

    public static String resverseword(String s) {
        String[] word = s.split(" ");
        String res = " ";
        for (int i = word.length - 1; i >= 0; i--) {

            if (i == 0) {
                res = res + word[i];

            } else {
                res = res + word[i] + " ";
            }
        }
        return res;
    }

    public static void main(String[] args){

        String s="java is programming language";
        System.out.println(resverseword(s));



    }



}

