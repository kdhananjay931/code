package Theory.recursion;

public class FindMax {

    static int max(int []arr, int index){

        if(index==arr.length-1){
            return arr[index];
        }

        int small=max(arr,index+1);
        return Math.max(arr[index],small);

    }



    public static void main(String[] args) {
        int []arr={2,3,10,5,6,1,4};
        System.out.println(max(arr,0));
    }
}
