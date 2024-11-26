package Theory.recursion;

public class PalindromeTwoPointer {

    static boolean palindromTwo(String s,int f,int l){
        if(f>=l)
            return true;

        return (s.charAt(f)==s.charAt(l) && s.charAt(f+1)==s.charAt(l-1));
    }

    public static void main(String[] args) {
        String st="ABBA";
        System.out.println(palindromTwo(st,0,st.length()-1));
    }
}
