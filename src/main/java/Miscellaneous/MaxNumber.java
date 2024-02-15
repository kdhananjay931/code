package Miscellaneous;

public class MaxNumber {
    public static void main(String[] args) {
        int []arr={2,3,10,9,2,5,6};
        int ans=0;

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>ans)
                ans=arr[i];
            }
        System.out.println(ans);
        }



}
