package Theory.Sorting;

public class SwapNoUsingBubbleSort {


    static void sort(int[] a) {

        for (int i = 0; i < a.length; i++) {
            boolean flag = false;
            for (int j = 0; j < a.length - i - 1; j++) {

                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag = true;
                }

            }
            if (!flag) {
                return;
            }

        }

    }

    public static void main(String[] args) {
        int[] a = {8, 54, 76, 10};
        sort(a);
        for (int i : a) {
            System.out.println(i);
        }
    }
}
