package Theory.Array;

public class MaxNumber {
  void max(){
    int [] num={5,6,7,1};
 int temp=0;
    for (int i = 0; i <num.length ; i++) {
            if (num[i] > temp) {
                 temp=num[i];



            }

        }
      System.out.println(temp);


    }



    public static void main(String[] args) {
        MaxNumber mx=new MaxNumber();
        mx.max();
    }
}
