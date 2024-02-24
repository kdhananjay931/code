package Theory.recursion;

public class Keypad {

    static void combination(String dig,String[]kp,String res){
        if(dig.length()==0) {
            System.out.println(res);
            return;
        }
        int currNum=dig.charAt(0)-'0';
         String currChoice=kp[currNum];
        for (int i = 0; i <currChoice.length() ; i++) {
            combination(dig.substring(1),kp,res+currChoice.charAt(i));

        }
    }

    public static void main(String[] args) {
         String dig="23";
        String []kp={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        combination(dig,kp,"");

    }
}
