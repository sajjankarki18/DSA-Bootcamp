package searching;

import java.util.Arrays;

public class Leetcode_167 {
    public static void main(String[] args) {
        int [] nums = {2,7,11,15};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    public static int [] twoSum(int[] numbers, int target) {

        for(int i = 0;i<numbers.length;i++){
            for(int j = i + 1;j< numbers.length;j++){
                if(target == numbers[i] + numbers[j]){
                    return new int[]{i + 1, j + 1};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
