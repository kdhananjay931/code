package Theory.Array;

import java.util.Arrays;

public class TargetReturnNoOfPair {

    static int returnNoOfPair(int [] arr, int target){

        int ans=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]+arr[j]==target){
                    ans ++;
                }

            }

        }
        return ans;

    }

    public static void main(String[] args) {
        int []arr={3,4,5,6,1};


        System.out.println(returnNoOfPair(arr, 6));
    }
}
