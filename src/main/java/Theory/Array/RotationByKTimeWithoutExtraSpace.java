package Theory.Array;

import java.util.Scanner;

public class RotationByKTimeWithoutExtraSpace {

    static void swap(int []arr ,int i,  int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void reverse(int []arr, int i, int j){
        while (i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    static void rotate(int []arr,int k){
        int n=arr.length;

        reverse(arr,n-k,n-1);
        reverse(arr,0,n-k-1);
        reverse(arr,0,n-1);

        }

        static void printary(int []arr){

            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);

            }
        }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
         int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of k");
        int k=sc.nextInt();
        rotate(arr,k);
        System.out.println("Print the rotated");
        printary(arr);
    }
    }



