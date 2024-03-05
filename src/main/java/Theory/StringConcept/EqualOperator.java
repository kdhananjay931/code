package Theory.StringConcept;

public class EqualOperator {

    public static void main(String[] args) {
        String s1="Hello";
        String s2="Hello";
        String s3= new String("Hello");
        System.out.println(s1==s3);// false because address Compared
        System.out.println(s1=s2);// ture because address same
        System.out.println(s1.equals(s3));// true because 1st its compare address if it is not same then its compare string
    }
}
