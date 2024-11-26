package Theory.Array;

public class FindRangeArray {

        public static int findRangeSum(int[] nums, int start, int end) {
            if (start < 0 || end >= nums.length || start > end) {
                throw new IllegalArgumentException("Invalid range");
            }

            int sum = 0;
            for (int i = start; i <= end; i++) {
                sum = nums[i]+sum;
            }
            return sum;
        }

        public static void main(String[] args) {
            int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int start = 0; // Start index of the range
            int end = 1;   // End index of the range

            int rangeSum = findRangeSum(nums, start, end);
            System.out.println("Sum of range from index " + start + " to " + end + " is: " + rangeSum);
        }
    }


