package Arrays;
//build array from permutation

import java.util.Arrays;

public class Leetcode_1920 {
    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 5, 3, 4};

        System.out.println(Arrays.toString(buildArray(nums)));
    }
    public static int [] buildArray(int [] nums){
        int k = nums.length;
        int []  new_arr = new int[k];

        for(int i = 0;i<k;i++){
            new_arr[i] = nums[nums[i]];
        }

        return new_arr;
    }
}
