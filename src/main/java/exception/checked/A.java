package exception.checked;



public class A extends Exception {

    public static void main(String[] args) {
        int i=10;
        int j=0;
        int res;

        try {
              res=(i/j);
            System.out.println(res);
        }
        catch (ArithmeticException e){
           // System.out.println(e.getMessage());
        }
        System.out.println("handled");
    }


}
