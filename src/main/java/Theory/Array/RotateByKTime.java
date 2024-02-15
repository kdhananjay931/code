package Theory.Array;

import java.util.Arrays;

public class RotateByKTime {

    static int[] rotateByK(int []arr){
         int []ans=new int[5];
         int j=0;
         int k=2;
         int n=arr.length;
        for (int i = n-k; i <n ; i++) {
             ans[j++]=arr[i];

        }
        for (int i = 0; i <n-k ; i++) {
            ans[j++]=arr[i];

        }
        return ans;
    }



    public static void main(String[] args) {
        int []arr={4,5,6,7,8};
        System.out.println(Arrays.toString(rotateByK(arr)));
    }
}
