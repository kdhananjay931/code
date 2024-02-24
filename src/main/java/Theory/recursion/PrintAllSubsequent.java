package Theory.recursion;

public class PrintAllSubsequent {

    static void subs(String s,String curr){
        if(s.isEmpty()) {
            System.out.println(curr);
            return;
        }
        char ch=s.charAt(0);
        String remString=s.substring(1);
        subs(remString,curr+ch);
        subs(remString,curr);


    }

    public static void main(String[] args) {
        String st="abc";
        subs(st," ");

    }
}
