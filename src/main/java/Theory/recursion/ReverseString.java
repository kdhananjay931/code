package Theory.recursion;

public class ReverseString {

    static String reverse(String s, int index){

        if(s.length()==index){
            return "";
        }
        String small=reverse(s,index+1);

        return small+s.charAt(index);

    }

    public static void main(String[] args) {
        String s="ABCD";
        System.out.println(reverse(s,0));
    }
}
