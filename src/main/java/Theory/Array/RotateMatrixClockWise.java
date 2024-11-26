package Theory.Array;

public class RotateMatrixClockWise {

    static void printMatrix(int [][]matrix,int c,int r){

        for (int i = 0; i < r; i++) {
            for (int j = 0; j <c ; j++) {
                System.out.print(matrix[i][j]+" ");

            }
            System.out.println();

        }
    }
    static void transposeWithoutSpace(int [][]matrix,int r,int c){

        for (int i = 0; i <c ; i++) {
            for (int j = i; j <r ; j++) {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }

        }
    }
    static void reverseColumn(int []arr){

        int i=0;int j=arr.length-1;
        while (i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;

        }

        }
       static void rotate(int [][]matrix, int n){

        transposeWithoutSpace(matrix,n,n);

            for (int i = 0; i <n ; i++) {
                reverseColumn(matrix[i]);

            }
        }



    public static void main(String[] args) {
         int [][]a={{1,2,3},
                    {4,5,6},
                    {7,8,9}};


        rotate(a,3);
        printMatrix(a,3,3);
    }
}
