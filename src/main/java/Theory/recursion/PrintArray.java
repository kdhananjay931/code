package Theory.recursion;

import java.util.Arrays;

public class PrintArray {

    static void printArr(int []arr, int index){
        if(index==arr.length) {
            return;
        }
        System.out.println(arr[index]);
        printArr(arr,index+1);



    }

    public static void main(String[] args) {
        int []arr={2,3,4,5,6,7,};
        printArr(arr,0);
    }
}
