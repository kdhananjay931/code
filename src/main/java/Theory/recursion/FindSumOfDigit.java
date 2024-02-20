package Theory.recursion;

public class FindSumOfDigit {


    static int sumOfDigit(int n) {

        if (n >= 0 && n <= 9) {
            return n;
        }
        return sumOfDigit(n / 10) +sumOfDigit(n%10);
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigit(123));
        ;
    }
}
