package Theory.Array;

public class CountNumbers {

    static int countnum(int [] arr, int num){
        int count=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==num){
                count++;
            }

        }return count;



    }


    public static void main(String[] args) {

        int [] arr={5,6,7,5,5};
        int num=5;
        System.out.println(countnum(arr, num));

    }
}
