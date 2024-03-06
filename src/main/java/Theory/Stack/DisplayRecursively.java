package Theory.Stack;

import java.util.Stack;

public class DisplayRecursively {

    static void displayRevRec(Stack<Integer> st){
        if(st.isEmpty())return;
        int top=st.pop();
        System.out.println(top +" ");
        displayRevRec(st);
        st.push(top);

    }


    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        st.push(2);
        st.push(3);
        st.push(5);
        st.push(6);
        st.push(7);
        displayRevRec(st);
    }

}
