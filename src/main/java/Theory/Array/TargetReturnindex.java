package Theory.Array;

import java.util.Arrays;

public class TargetReturnindex {

    static int[] returnIndex(int[] arr, int target) {


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {

                    return new int[]{arr[i], arr[j]};
                }

            }

        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 7, 8};

        System.out.println(Arrays.toString(returnIndex(arr, 11)));

    }
}
