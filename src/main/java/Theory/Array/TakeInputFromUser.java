package Theory.Array;

import java.util.Scanner;

public class TakeInputFromUser {

    public static void main(String[] args) {
        System.out.println("Enter the size of Array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];

        System.out.println("Enter the number");
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();

        }
        for (int i = 0; i < n; i++) {

            System.out.println("Print the number");
            System.out.print(arr[i]);

        }
    }
}
