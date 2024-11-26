package Theory.Array;

import java.util.Scanner;

public class SortEvenAndOdd {

    static void printArray(int[]arr){
        for (int j : arr) {
            System.out.println(j);

        }
    }
    static void swapEvenOdd(int []arr, int i,int j ){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;


    }
    static void reverseOddEven(int []arr){
        int left=0;
        int right=arr.length-1;
        while (left<right){

            if (arr[left]%2==1 && arr[right]%2==0){
                swapEvenOdd(arr,left,right);
                left++;
                right--;

            }
            if (arr[left]%2==0){
                left++;
            }
            if (arr[right]%2==1) {
                right--;

            }
        }

    }

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter the array");
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();

        }
        //int []arr={1,2,3,4,5};
        reverseOddEven(arr);
        printArray(arr);
    }
}
