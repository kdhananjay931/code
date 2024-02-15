package Miscellaneous;

public class SearchIndex {

   void  seacharr() {

       int[] arr = {3, 6, 8,6,4};
       int x = 6;
       int ans=-1;
       for (int i = 0; i < arr.length; i++) {
           if (arr[i]==x) {
               ans=i;

           }


       }
       System.out.println(ans);

   }
    public static void main(String[] args) {
       SearchIndex searchArray=new SearchIndex();
       searchArray.seacharr();
    }
}
