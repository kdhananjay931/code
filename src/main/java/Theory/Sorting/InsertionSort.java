package Theory.Sorting;

public class InsertionSort {
    static void insertion(int[] a) {

        for (int i = 1; i < a.length; i++) {
            int j = i;

            while (j > 0 && a[j] < a[j - 1]) {
                int temp = a[j];
                a[j] = a[j - 1];
                a[j - 1] = temp;
                j--;
            }
        }
    }


    public static void main(String[] args) {
        int[] a = {2, 4, 3, 6, 32, 56};
        insertion(a);
        for (int i : a) {
            System.out.println(i + " ");

        }
    }
}
