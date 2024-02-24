package Theory.recursion;

public class SeriesOddEven {

    static int printOddEven(int n){

        if(n==0)return 0;
        if(n%2==0){ //even

            return printOddEven(n-1)-n;
        }else
            return printOddEven(n-1)+n;
    }
    public static void main(String[] args) {
        System.out.println(printOddEven(5));
        //1-2+3-4+5

    }
}
