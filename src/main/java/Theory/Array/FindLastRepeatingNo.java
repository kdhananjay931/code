package Theory.Array;

public class FindLastRepeatingNo {

    static int lastRepeat(int []arr){

        for (int i = arr.length-1; i >= 0; i--) {
            for (int j = i-1; j >=0 ; j--) {
                if (arr[i]==arr[j]){
                    return arr[i];
                }

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int []arr={4,6,6,1,1,7,7,10};
        System.out.println(lastRepeat(arr));
    }
}
