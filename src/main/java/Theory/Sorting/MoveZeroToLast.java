package Theory.Sorting;

public class MoveZeroToLast {

    static void moveZero(int []a){

        for (int i = 0; i < a.length-1; i++) {

            for (int j = 0; j <a.length-i-1 ; j++) {
                if(a[j]==0 && a[j+1]!=0){
                    int temp=a[j];
                       a[j]=a[j+1] ;
                       a[j+1]=temp;
                }

            }
        }
    }

    public static void main(String[] args) {
        int []arr={2,0,5,0,4,5,6};
        moveZero(arr);
        for (int i:arr){
            System.out.println(i);
        }
    }
}
