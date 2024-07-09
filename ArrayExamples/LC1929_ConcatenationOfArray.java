package ArrayExamples;

import java.util.Arrays;

public class LC1929_ConcatenationOfArray {

    // ans[i] == nums[i] and ans[i + n] == nums[i]

    public static void main(String[] args) {
        int[] nums = {1,2,1};
        int[] out = concatenateArray(nums);
        System.out.println(Arrays.toString(out));
    }

    private static int[] concatenateArray(int[] nums) {
        int out[] = new int[nums.length*2];
        for(int i =0; i <nums.length; i++){
            out[i] = nums[i];
            out[i + nums.length] = nums[i];
        }
        return out;
    }
}
