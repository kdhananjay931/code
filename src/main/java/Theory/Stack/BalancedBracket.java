package Theory.Stack;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBracket {
    public static boolean balanced(String str){
        Stack<Character> bb=new Stack<>();
        int n=str.length();
        for (int i = 0; i < n; i++) {
            char ch=str.charAt(i);

            if(ch=='('){
                bb.push(ch);
            }else{
                if(bb.size()==0)return false;
                if(bb.peek()=='(') bb.pop();
            }

        }
        if(bb.size()>0) return false;
          else return true;



    }

    public static void main(String[] args) {
        System.out.println("enter the String");
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        System.out.println(balanced(str));
    }
}
