package searching;

public class Leetcode_287 {
    public static void main(String[] args) {
        int [] nums = {3,1,3,4,2};

        System.out.println(findDuplicate(nums));
    }
    public static int findDuplicate(int[] nums) {
        if(nums.length == 0){
            return -1;
        }

        for(int i = 0;i<nums.length;i++){
            for(int j = i + 1;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    return nums[i];
                }
            }
        }
        return -1;
    }
}
