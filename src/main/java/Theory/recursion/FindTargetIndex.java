package Theory.recursion;

public class FindTargetIndex {

    static int targetIndex(int []a,int target,int index){

        if(index>=a.length)

            return -1;
        if(a[index]==target)
            return index;

        return targetIndex(a,target,index+1);


    }


    public static void main(String[] args) {
        int []a={12,13,13,67,60};

        System.out.println(targetIndex(a,13,0));
    }
}
