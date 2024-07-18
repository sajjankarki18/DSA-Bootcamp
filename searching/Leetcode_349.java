package searching;

import java.util.Arrays;
import java.util.HashSet;

public class Leetcode_349 {
    public static void main(String[] args) {
        int [] nums1 = {4,9,5};
        int [] num2 = {9,4,9,8,4};

        System.out.println(Arrays.toString(intersection(nums1, num2)));

    }
    public static int [] intersection(int [] nums1, int [] nums2){
        HashSet<Integer> set1 = new HashSet<>();

        for(int num: nums1){
            set1.add(num);
        }

        HashSet<Integer> set2 = new HashSet<>();

        for(int num: nums2){
            if(set1.contains(num)){
                set2.add(num);
            }
        }

        int [] res = new int[set2.size()];
        int i = 0;

        for(int num: set2){
            res[i++] = num;
        }

        return res;
    }
}
