package Theory.recursion;

public class RemoveOccurenceFromString {

    static String removeA(String s, int index){

        if(index==s.length())
            return "";

        String small=removeA(s,index+1);
         char curr=s.charAt(index);

        if(curr!='a'){
            return curr+small;
        }else {
            return small;
        }
    }

    public static void main(String[] args) {
           String s="aabcatraa";
        System.out.println(removeA(s,0));
    }
}
