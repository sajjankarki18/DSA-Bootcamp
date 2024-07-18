package searching;

public class Leetcode_1095 {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,3,1};
        int target = 3;

        System.out.println(findInMountainArray(nums, target));
    }
    public static int findInMountainArray(int [] arr, int target){
        int peak = find_peak(arr);
        int bs = binary_search(arr, target, 0, peak);

        if(bs != -1){
            return bs;
        }

        return binary_search(arr, target, peak + 1, arr.length - 1);
    }

    public static int find_peak(int [] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid + 1]){
                end = mid;
            }else {
                start = mid + 1;
            }
        }
        return start;
    }
    public static int binary_search(int [] arr, int target, int start, int end){
        boolean is_Asc = arr[start] < arr[end];

        while (start <= end){
            int mid = start + (end - start) / 2;

            if(is_Asc){
                if(target > arr[mid]){
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                }else {
                    return mid;
                }
            }else {
                if(target > arr[mid]){
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }else {
                    return mid;
                }
            }
        }

        return -1;
    }
}
