package Theory.Array;

public class MultiDimension {

    void muti() {
        int[][] arr = {{34, 5, 6}, {21, 45, 88,}, {7, 899, 44}};

       // System.out.println(arr[0][2]);

        for (int i=0;i<arr.length;i++){

            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);

            }
        }
    }

    public static void main(String[] args) {
        MultiDimension mt=new MultiDimension();
        mt.muti();
    }

}
