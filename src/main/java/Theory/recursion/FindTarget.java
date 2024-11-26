package Theory.recursion;

public class FindTarget {

    static boolean searchTarget(int []a,int target,int index){

        if(index>=a.length){
            return false;
        }
        if(a[index]==target){
            return true;
        }
        return searchTarget(a,target,index+1);

    }

    public static void main(String[] args) {
        int []a={3};

        if(searchTarget(a,3 ,1)){
            System.out.println("Found");
        }else {
            System.out.println("Not Found");
        }
    }
}
