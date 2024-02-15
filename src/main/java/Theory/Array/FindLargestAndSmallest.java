package Theory.Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindLargestAndSmallest {

    static int[] LarAndSmall(int []arr){

        for (int i = 0; i <arr.length ; i++) {
            Arrays.sort(arr);

        }
        return new int [] {arr[0],arr[arr.length-1]};
    }


    public static void main(String[] args) {
        int [] arr={2,4,5,3,4,3,9};
        System.out.print(Arrays.toString(LarAndSmall(arr)));
    }
}
