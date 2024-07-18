package searching;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class Leetcode_315 {
    public static void main(String[] args) {
        int [] nums = {5,2,6,1};

        System.out.println(countSmaller(nums));
    }
    public static List<Integer> countSmaller(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

       int count = 0;
       int j = 0;

       for(int i = 0;i<nums.length;i++){
           if(nums[i] < nums[j]){
               count++;
               j++;
           }
           list.add(count);
       }

       Collections.reverse(list);
       return list;
    }
}
