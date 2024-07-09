package ArrayExamples;

import java.util.Arrays;

public class LC1480_RunningSumOf1DArray {
    // running sum of an array as runningSum[i] = sum(nums[0]…nums[i])

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] out = runningSum(nums);
        System.out.println(Arrays.toString(out));
    }

    private static int[] runningSum(int[] nums) {
        for(int i =1; i<nums.length; i++){
            nums[i] = nums[i-1]+ nums[i];
        }
        return nums;
    }
}
