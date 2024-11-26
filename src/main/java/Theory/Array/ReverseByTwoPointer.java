package Theory.Array;


public class ReverseByTwoPointer {

    static void printArray(int []arr){
        for (int j : arr) {
            System.out.println(j);

        }
    }
    static void swapFirstLast(int []arr,int i, int j) {

        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]=temp;


    }
  static void reverseArray(int []arr){

        int i=0; int j=arr.length-1;
        while (i<j){
            swapFirstLast(arr,i,j);
            i++;
            j--;
        }

    }


    public static void main(String[] args) {

        int []arr={4,5,10,7,8};

        reverseArray(arr);
        printArray(arr);
    }
}
