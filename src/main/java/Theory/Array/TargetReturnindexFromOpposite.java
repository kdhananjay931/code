package Theory.Array;

import java.util.Arrays;

public class TargetReturnindexFromOpposite {

    static int[] returnIndex(int[] arr, int target) {


        for (int i = arr.length-1; i >=0; i--) {
            for (int j = arr.length-i; j>=0 ; j--) {
                if (arr[j] + arr[i] == target) {

                    return new int[]{arr[j], arr[i]};
                }

            }

        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 8, 7};

        System.out.println(Arrays.toString(returnIndex(arr, 11)));

    }
}
