package searching;

public class OrderOgnosticBS {
    public static void main(String[] args) {
        int [] asc = {10,12,13,14,15,16,25,34,56,78,88,90,99};
        int [] desc = {99,90,88,78,56,34,25,16,15,14,13,12,10};

        int target = 90;

        System.out.println(search(desc, target));

    }
    public static int search(int [] nums, int target){
        int start  = 0;
        int end = nums.length - 1;

        boolean isAsc = nums[start] < nums[end];

        while (start <= end){
            int mid = start + (end - start) / 2;

            if(isAsc){
                if(target > nums[mid]){
                    start = mid + 1;
                } else if (target < nums[mid]) {
                    end = mid - 1;
                }else {
                    return mid;
                }
            }else {
                if(target > nums[mid]){
                    end = mid - 1;
                } else if (target < nums[mid]) {
                    start = mid + 1;
                }else {
                    return mid;
                }
            }
        }

        return -1;
    }
}
