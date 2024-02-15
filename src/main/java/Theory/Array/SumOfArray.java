package Theory.Array;

public class SumOfArray {

   void  sum(){
        int []arr={1,5,3};

        int add=0;

       for (int i = 0; i <arr.length ; i++) {

           add= add + arr[i];

       }
       System.out.println(add);
    }

    public static void main(String[] args) {
SumOfArray sd=new SumOfArray();
sd.sum();
    }
}
