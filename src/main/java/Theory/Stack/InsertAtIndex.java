package Theory.Stack;

import java.util.Stack;

public class InsertAtIndex {
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        st.push(2);
        st.push(3);
        st.push(5);
        st.push(6);
        st.push(7);
        int index=2;
        int element=4;

        Stack<Integer> temp= new Stack<>();
        while (st.size()>index){
            temp.push(st.pop());
        }
        st.push(element);

        while (temp.size()>0){
            st.push(temp.pop());
        }
        System.out.println(st);
    }
}
