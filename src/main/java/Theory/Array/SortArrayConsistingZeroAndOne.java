package Theory.Array;

public class SortArrayConsistingZeroAndOne {

    static void printArray(int []arr){
        for (int j : arr) {
            System.out.println(j);

        }

    }
    static void swapNumber(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;


    }
    static void sortArrayZeroAndOne(int []arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {

            if (arr[left] == 1 && arr[right] == 0) {
                swapNumber(arr, left, right);
                left++;
                right--;

            }
            if (arr[left] == 0) {
                left++;
            }
            if (arr[right] == 1) {
                right--;
            }

        }
    }


    public static void main(String[] args) {
        int []arr={0,1,0,1,0,1,0,0,1};
        sortArrayZeroAndOne(arr);
        printArray(arr);

    }
}
