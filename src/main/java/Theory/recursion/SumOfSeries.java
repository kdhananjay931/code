package Theory.recursion;

public class SumOfSeries {

    static int series(int n){
        if(n==0){

            return 0;
        }
       return series(n-1)+n;
    }

    public static void main(String[] args) {
        System.out.println(series(3));
    }
}

