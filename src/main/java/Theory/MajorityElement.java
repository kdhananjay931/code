package Theory;

public class MajorityElement {

    public static void main(String[] args) {
        int [] arr= {3,2,3};
        System.out.println(majority(arr));
    }



   public static int majority(int [] arr) {
        int count = 0;
        int res = 0;

        for (int i = 0; i < arr.length;i++){
            if(count==0 && res!=arr[i]){
                res=arr[i];
                count++;
            } else if (res==arr[i]) {
                count++;

            }else
                count--;
        }
        return res;
    }

}
