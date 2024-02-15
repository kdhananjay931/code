package Theory.Array;

public class SortNoInDecreasingOfSquare {
    static void printArray(int[]arr){
        for (int j : arr) {
            System.out.println(j);

        }
    }
    static void reverno(int []arr){

        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.println(arr[i]);

        }
    }

    static int[] square(int []arr){
        int left=0;
        int right=arr.length-1;
        int []ans= new int[arr.length];
        int k=0;
        while (left<=right){
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                ans [k]=arr[left] * arr[left];
                k++;
                left++;
            }else {
                ans[k]=arr[right] * arr[right];
                k++;
                right--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
         int []arr={-10,4,5,6,7};

        int [] ans = square(arr);
        System.out.println("Print in Decreasing");
         printArray(ans);
        System.out.println("Print in Increasing");
         reverno(ans);
    }
}
