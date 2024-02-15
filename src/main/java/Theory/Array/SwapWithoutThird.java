package Theory.Array;

public class SwapWithoutThird {

    static void swapWthout(int a,int b){
        a=a+b; //12
        b=a-b; //9
        a=a-b; //3

        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        int a=9;
        int b=3;
        swapWthout(9,3);
    }
}
