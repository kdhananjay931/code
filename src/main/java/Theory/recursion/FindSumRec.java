package Theory.recursion;

public class FindSumRec {

    static int sum(int []arr,int index){
        if(index==arr.length){

            //3==4-1
            return 0;
        }
         int add=sum(arr,index+1);
        return add+arr[index];
    }

    public static void main(String[] args) {
        int []arr={5};
        System.out.println(sum(arr,0));
    }
}
