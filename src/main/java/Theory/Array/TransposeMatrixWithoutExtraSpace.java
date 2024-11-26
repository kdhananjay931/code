package Theory.Array;

public class TransposeMatrixWithoutExtraSpace {

    static void printMatrix(int [][]matrix ,int r, int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
    static void transposeWithoutSpace(int [][]a,int r,int c){

        for (int i = 0; i <c ; i++) {
            for (int j = i; j <r ; j++) {
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }

        }
    }

    public static void main(String[] args) {
 int [][]a={{1,2,3,},
         {4,5,6},{7,8,9}};

 transposeWithoutSpace(a,3,3);
        printMatrix(a,3,3);
    }
}
