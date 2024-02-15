package Theory.Array;

public class SearchNumber {

    void number(){

        int []arr={3,5,6,8};
        int x=3;
        int ans=-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==x)
            {
                ans = i;
            }
        }System.out.println(ans);

    }


    public static void main(String[] args) {
        SearchNumber sr= new SearchNumber();
        sr.number();
    }
}
