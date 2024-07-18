package searching;

public class Leetcode_704 {
    public static void main(String[] args) {
        int [] nums = {-1,0,3,5,9,12};
        int target = 9;

        System.out.println(search(nums, target));
    }
    public static int search(int[] nums, int target) {
        if(nums.length == 0){
            return -1;
        }

        int start = 0;
        int end = nums.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if(target > nums[mid]){
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
