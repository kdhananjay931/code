package Miscellaneous;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {


        int[] nums = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twosum(nums,18)));
    }

     static int[] twosum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int []{nums[i],nums[j]};
                }

            }

        } return new int[]{};
    }


}
