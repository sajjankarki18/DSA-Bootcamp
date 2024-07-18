package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Leetcode_1480 {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4};

        System.out.println(Arrays.toString(runningSum(nums)));
    }
    public static int [] runningSum(int [] nums){
        int k = nums.length;
        int [] running_sum = new int[k];

        running_sum[0] = nums[0];
        
        for(int i=1;i<k;i++){
            running_sum[i] = running_sum[i - 1] + nums[i];

        }
        return running_sum;
    }
}
