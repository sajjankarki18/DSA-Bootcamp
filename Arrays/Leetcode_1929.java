package Arrays;

import java.util.Arrays;

public class Leetcode_1929 {
    public static void main(String[] args) {
        int [] nums = {1,3,5,7,9};

        System.out.println(Arrays.toString(getConcatenation(nums)));
    }
    public static int [] getConcatenation(int [] nums){
        int k = nums.length;
        int [] new_arr = new int[k * 2];

        for(int i = 0;i<k;i++){
            new_arr[i] = nums[i];
            new_arr[i + k] = nums[i];
        }

        return new_arr;
    }
}
