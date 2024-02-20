package Theory.recursion;


import java.util.Scanner;

public class PrintNToOne {
    static void printDecreasing(int n) {
    if(n==1){
        System.out.println(1);
        return;
    }
        System.out.println(n);
    printDecreasing(n-1);
    }


    public static void main(String[] args) {
        System.out.println("Enter the value of n");
        Scanner sc= new Scanner(System.in);
         int n=sc.nextInt();

        printDecreasing(n);
    }
}
