package searching;

public class binary_searching {
    public static void main(String[] args) {
        int [] nums = {10,12,24,45,67,89,93,96,99};
        int target = 99;

        System.out.println(binarySearch(nums, target));
    }
    public static int binarySearch(int [] nums, int target){
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
