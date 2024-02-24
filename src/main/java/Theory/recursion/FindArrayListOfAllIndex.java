package Theory.recursion;

import java.util.ArrayList;


public class FindArrayListOfAllIndex {

    static ArrayList<Integer> returnIndexList(int[] a, int target, int index) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (index >= a.length)
            return ans;


        if (a[index] == target) {
            ans.add(index);
        }
        ArrayList<Integer> smallAns = returnIndexList(a, target, index + 1);
        ans.addAll(smallAns);
        return ans;
    }

    public static void main(String[] args) {
        int[] a = {10, 10, 10, 20, 30, 10};
        ArrayList<Integer> ans = returnIndexList(a, 10, 0);

        System.out.println(ans);
    }
}





