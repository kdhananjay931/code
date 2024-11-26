package Theory.Array;

public class PrefixSum {

    static void printArray(int[]arr){
        for (int j : arr) {
            System.out.println(j);

        }
    }

    static int[] prefixSum(int[]arr){

        for (int i = 1; i <arr.length ; i++) {

            arr[i]=arr[i-1]+arr[i];

        }
        return arr;

    }
    public static void main(String[] args) {
        int []arr={2,3,4,5,6};
        int []ans=prefixSum(arr);
        printArray(ans);
    }
}
