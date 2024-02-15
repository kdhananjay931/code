package Theory.Array;

public class SwapNumberUsingthird {
    static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;

        System.out.println("a " +a);
        System.out.println("b " +b);


    }

    public static void main(String[] args) {
        int a=9;
        int b=3;
       swap(9,3);
    }

}
