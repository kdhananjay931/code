package Theory.Array;

public class PrefixSumAndSuffixSum {

    static int FindTotalSum(int []arr){
           int totalsum=0;
        for (int i = 0; i <arr.length ; i++) {
            totalsum=totalsum+arr[i];
        }
        return totalsum;
    }
    public static boolean prefixSuffix(int []arr){
          int  totalsum= FindTotalSum(arr);
          int prefixsum=0;
        for (int i = 0; i <arr.length ; i++) {

            prefixsum=prefixsum+arr[i];

           int  sufixsum=totalsum-prefixsum;
           if (prefixsum==sufixsum){
               return true;
           }
        }
        return false;
    }

    public static void main(String[] args) {

        int []arr={3,5,5,3,4,4};
        System.out.println(prefixSuffix(arr));


    }
}
