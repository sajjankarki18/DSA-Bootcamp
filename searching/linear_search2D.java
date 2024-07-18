package searching;

import java.util.Arrays;

public class linear_search2D {
    public static void main(String[] args) {
        int [][] nums = {
                {10,12,16},
                {23,45,67},
                {30,49,70},
                {55,69,98}
        };

        int target = 55; //ans = {3,0}

        System.out.println(Arrays.toString(searchIn2DArrays(nums, target)));

    }
    public static int [] searchIn2DArrays(int [][] nums, int target){
        if(nums.length == 0){
            return new int[]{-1,-1};
        }

        for(int i = 0;i<nums.length;i++){
            for(int j = 0;j<nums.length - 1;j++){
                if(target == nums[i][j]){
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{-1,-1};
    }
}
