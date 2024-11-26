package Theory.Array;

public class RangeSum {
    public static void main(String[] args) {
        int start = 1; // starting number of the range
        int end = 10; // ending number of the range

        int sum = findSumInRange(start, end);
        System.out.println("Sum of numbers from " + start + " to " + end + " is: " + sum);
    }

    public static int findSumInRange(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }
}
