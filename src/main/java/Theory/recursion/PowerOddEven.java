package Theory.recursion;

public class PowerOddEven {

    static int power(int p,int q) {

        if (q == 0) return 1;

        int ans = power(p, q / 2);
        if (q % 2 == 0) {

            return ans * ans;


        }
        return ans*ans*p;
    }

    public static void main(String[] args) {
        System.out.println(power(4,3));

}
}