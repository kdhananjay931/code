package Theory.recursion;

public class SumOfSubSet {
static void sumOfSubSets(int[]a,int index,int sum){

    if(index>=a.length){
        System.out.println(sum);
        return;
    }
    sumOfSubSets(a,index+1,sum+a[index]);
    sumOfSubSets(a,index+1,sum);
}


    public static void main(String[] args) {
      int []a={2,4,5};
        sumOfSubSets(a,0,0);
    }
}
