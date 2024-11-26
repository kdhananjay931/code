package Theory.Array;

public class FindUnique {

    static int unique(int []arr){
           int ans=-1;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {

                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;

                }
                if(arr[i]>0){
                    ans=arr[i];
                }
            }


        }

       return ans;
    }

    public static void main(String[] args) {
        int []arr={1,2,3,4,1,2,3};

        System.out.println(unique(arr));

    }
}
