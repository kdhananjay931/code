package Theory.recursion;

public class RemoveOccurenceFromStringSubString {

    static String removeA(String s){

        if(s.isEmpty())
            return "";

        String small=removeA(s.substring(1));
         char curr=s.charAt(0);

        if(curr!='a'){
            return curr+small;
        }else {
            return small;
        }
    }

    public static void main(String[] args) {
           String s="aabcatraa";
        System.out.println(removeA(s));
    }
}
