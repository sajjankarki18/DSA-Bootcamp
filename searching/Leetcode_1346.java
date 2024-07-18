package searching;

public class Leetcode_1346 {
    public static void main(String[] args) {
        int [] nums = {7,1,14,11};

        System.out.println(checkIfExist(nums));
    }
    public static boolean checkIfExist(int [] nums){
        if(nums.length == 0){
            return false;
        }

        for(int i = 0;i<nums.length;i++){
            for(int j = i + 1;j<nums.length;j++){
                if(nums[i] == 2 * nums[j] || nums[i] * 2 == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
