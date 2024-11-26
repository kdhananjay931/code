package Theory.Array;

public class FindSecondHighest {
    public static void main(String[] args) {
        int[] arr = {45, 80, 54, 66, 78};

        System.out.println(findSecond(arr));
    }

    static int findmax(int[] arr) {
        int mx = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mx) {
                mx = arr[i];

            }

        }
        return mx;

    }

    static int findSecond(int[] arr) {
        int mx = findmax(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == mx) {
                arr[i] = Integer.MIN_VALUE;
            }

        }

        return findmax(arr);

    }


}
