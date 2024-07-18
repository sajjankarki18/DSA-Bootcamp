package searching;

public class Leetcode_852 {
    public static void main(String[] args) {
        int [] nums = {0,10,5,2};

        System.out.println(peakIndexInMountainArray(nums));
    }
    public static int peakIndexInMountainArray(int[] arr) {
        if(arr.length == 0){
            return -1;
        }

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
}
