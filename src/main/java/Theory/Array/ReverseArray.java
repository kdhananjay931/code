package Theory.Array;

import java.util.Arrays;

public class ReverseArray {
    static void reversearr(int [] arr){

        for (int i = arr.length-1; i >0 ; i--) {

            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int []arr={4,5,6,7,8,9};
        reversearr(arr);
    }
}
