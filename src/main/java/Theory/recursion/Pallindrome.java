package Theory.recursion;

public class Pallindrome {
    static String reverse(String s, int index){

        if(s.length()==index){
            return "";
        }
        String small=reverse(s,index+1);

        return small+s.charAt(index);

    }

    public static void main(String[] args) {
        String s="ABBAC";
        String rev=reverse(s,0);

        if(rev.equals(s)){
            System.out.println("palindrome");
        }else {
            System.out.println("Not Palindrome");
        }


    }

}
