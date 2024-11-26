package Theory.recursion;

import java.util.Scanner;

public class PrintOneToN {

    static void printIncreasing(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        printIncreasing(n-1);
        System.out.println(n);


    }


    public static void main(String[] args) {
        System.out.println("Enter the value of n");

        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        printIncreasing(5);
    }
}
