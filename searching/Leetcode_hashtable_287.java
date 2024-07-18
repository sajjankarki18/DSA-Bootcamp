package searching;

import java.util.HashMap;
import java.util.HashSet;

public class Leetcode_hashtable_287 {
    public static void main(String[] args) {
        int [] nums = {3,1,3,4,2};

        System.out.println(findDuplicate(nums));
    }
    public static int findDuplicate(int [] nums){
        HashSet<Integer> set = new HashSet<>();

        for(int num: nums){
            if(set.contains(num)){
                return num;
            }
            set.add(num);

        }
        return -1;
    }
}
