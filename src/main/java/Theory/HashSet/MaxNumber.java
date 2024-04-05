package Theory.HashSet;

import java.util.HashSet;

public class MaxNumber {

    static int maxNumberOnTable(int[] bag) {
        HashSet<Integer> st = new HashSet<>();
        int max = 0;
        for (int num : bag) {
            if (st.contains(num)) {
                st.remove(num);
            } else {
                st.add(num);
                max = Math.max(max, st.size());
            }
        }
return max;

    }
    public static void main(String[] args) {
        int []nums={2,1,1,3,2,3};
        System.out.println(maxNumberOnTable(nums));
    }
}
