package searching;

import java.util.ArrayList;
import java.util.Arrays;

public class Leetcode_350 {
    public static void main(String[] args) {
        int [] nums1 = {4,9,5};
        int [] nums2 = {9,4,9,8,4};

        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list1 = new ArrayList<>();

        for(int num: nums1){
            list1.add(num);
        }

        ArrayList<Integer> list2 = new ArrayList<>();

        for(int num: nums2){
            if(list1.contains(num)){
                list2.add(num);
                list1.remove(Integer.valueOf(num));
            }
        }

        int[] res = new int[list2.size()];
        int i = 0;

        for(int num: list2){
            res[i++] = num;
        }

        return res;
    }
}
