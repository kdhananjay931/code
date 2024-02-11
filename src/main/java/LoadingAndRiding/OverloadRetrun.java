package LoadingAndRiding;

public class OverloadRetrun {

    int run(int a, int b) {
        return a+b;
    }

    int run(int a, int b,int c) {
        return a+b+c;
    }

    public static void main(String[] args) {
        OverloadRetrun a= new OverloadRetrun();
        System.out.println(a.run(5,6));
    }
}
