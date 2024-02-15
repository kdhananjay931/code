package Miscellaneous;

public class SearchNumber {

    void search() {
        int[] arr = {3, 7, 8, 9};
        int res = 7;
        boolean found=false;
        for (int i = 0; i <arr.length ; i++) {

            if(arr[i]==res)
            {
               found =true;

            }


        }
        if(found){
            System.out.println(res);

        }
        else {
            System.out.println("Not Found");
        }

    }

    public static void main(String[] args) {
    SearchNumber seachNumber=new SearchNumber();
    seachNumber.search();
    }

}
