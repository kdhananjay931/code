package Theory.Array;

import java.util.Enumeration;
import java.util.Scanner;

public class FindfirstRepeatingNo {

    static int findFirstRepeater(int []arr){

        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){

                    return arr[i];

                }

            }

        }

        return -1;
    }

    public static void main(String[] args) {
       /* System.out.println("Enter the size of Array");

        Scanner sc = new Scanner(System.in);
         int  num = sc.nextInt();
        int[] arr = new int[num];
        System.out.println("Enter the array");
        int array=sc.nextInt();*/

        int []arr={4,6,1,1,3,2,3};

        System.out.println(findFirstRepeater(arr));

    }
}
