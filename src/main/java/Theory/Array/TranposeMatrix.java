package Theory.Array;

import java.util.Arrays;

public class TranposeMatrix {
   public static void printMatrix(int[][] matrix) {
     for (int i = 0; i <2; i++) {
          for (int j = 0; j <3; j++) {
               System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
  }
    static int [][] transpose(int [][] matrix, int r, int c){

        int [][]ans= new int[c][r];
        for (int i = 0; i <c ; i++) {
            for (int j = 0; j <r ;j++) {
                ans[i][j]=matrix[j][i];

            }

        }
return ans;
    }

    public static void main(String[] args) {

        int [][] a={{1,2,},
                    {4,5,},
                    {5,2,}};
        int [][] result= transpose(a, 3, 2);
         printMatrix(result);
    }

}
