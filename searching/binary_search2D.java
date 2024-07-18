package searching;

import java.lang.reflect.Array;
import java.util.Arrays;

public class binary_search2D {
    public static void main(String[] args) {
        int [][] nums = {
                {10,12,16},
                {23,45,67},
                {30,49,70},
                {55,69,98}
        };

        int target = 55;

        System.out.println(Arrays.toString(binarySearch2D(nums, target)));
    }

    public static int [] binarySearch2D(int [][] nums, int target){
        int row = 0;
        int col = nums[0].length - 1;

        while (row < nums.length && col >= 0){
            if(target == nums[row][col]){
                return new int[]{row, col};
            }

            if(target > nums[row][col]){
                row++;
            }else {
                col--;
            }
        }

        return new int[]{-1,-1};
    }
}
