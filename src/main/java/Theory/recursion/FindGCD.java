package Theory.recursion;

import java.util.Scanner;

public class FindGCD {

    static int gcd(int x, int y) {

        while (x % y != 0) {
            int rem = x % y;
            x = y;
            y = rem;
        }
        return y;

    }

    public static void main(String[] args) {
        System.out.println("Enter the value x");
        Scanner sc = new Scanner(System.in);

        int x=sc.nextInt();
        System.out.println("Enter the value of y");
        int y=sc.nextInt();

        System.out.println(gcd(x,y));
    }
}
