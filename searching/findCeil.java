package searching;

public class findCeil {
    public static void main(String[] args) {
        int [] nums = {12,24,35,48,55,67,89,98,99};
        int target = 98;

        System.out.println(find_ceil(nums, target));

    }
    public static int find_ceil(int [] nums, int target){
        int start = 0;
        int end = nums.length - 1;

        while (start < end){
            int mid = start + (end - start) / 2;

            if(target >= nums[mid]){
                start = mid + 1;
            }else {
                end = mid;
            }
        }
        return end;
    }
}
