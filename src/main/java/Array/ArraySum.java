package Array;

public class ArraySum {

        public static void main (String[]args){
            int[] arr = {1, 5, 3};
            int output = 9;
            int sum = 0;
            for (int j : arr) {
                sum = sum + j;

                if (sum == output) {

                    System.out.println(sum);
                }


            }

        }


    }
