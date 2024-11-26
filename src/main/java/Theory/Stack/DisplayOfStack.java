package Theory.Stack;

import java.util.Stack;

public class DisplayOfStack {
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        st.push(2);
        st.push(3);
        st.push(5);
        st.push(6);
        st.push(7);

        Stack<Integer> rt= new Stack<>();
        while (st.size()>0) {
            rt.push(st.pop());

        }
        while (rt.size()>0) {
            int x=rt.pop();
            System.out.println(x + " ");
            st.push(x);
        }
    }
}
