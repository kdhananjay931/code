package Theory.Array;

public class Lastindex {
    int [] arr={5,6,3,8,5,3,8,5};
    int res=3;
    int inde=-1;
     void last(){
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==res) {

                inde=i;
            }

        }
         System.out.println(inde);


    }

    public static void main(String[] args) {
     Lastindex lt=new Lastindex();
     lt.last();

    }
}
