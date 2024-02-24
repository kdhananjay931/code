package Theory.recursion;

public class FIndAllIndexOfTarget {

    static void findAllTargetIndex(int[] a, int target, int index) {
        if (index >= a.length)
            return;
        if (a[index] == target) {
            System.out.println(index);
        }
        findAllTargetIndex(a, target, index + 1);

    }

    public static void main(String[] args) {
        int[] a = {10, 20, 20, 30, 10, 40, 50};
        findAllTargetIndex(a, 20, 0);
    }
}
