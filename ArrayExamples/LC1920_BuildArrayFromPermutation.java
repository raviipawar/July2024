package ArrayExamples;

import java.util.Arrays;

public class LC1920_BuildArrayFromPermutation {

   // Input: nums = [0,2,1,5,3,4]
   // Output: [0,1,2,4,5,3]
    // condition ans[i] = nums[nums[i]]

    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        int[] out = buildArray(nums);
        System.out.println(Arrays.toString(out));
    }

    private static int[] buildArray(int[] nums) {
        int[] output = new int[nums.length];
        for (int i =0; i < nums.length; i++){
            output[i] = nums[nums[i]];
        }
        return  output;
    }
}
