package Theory.recursion;

public class TableRec {

    static void printmult(int n, int k){
        if(k==0) return;

        printmult(n,k-1);

        System.out.println(n*k);
    }

    public static void main(String[] args) {
        printmult(5,4);
    }
}
