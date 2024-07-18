package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_1431 {
    public static void main(String[] args) {
        int [] candies = {2,3,5,1,3};
        int extraCandies = 3;

        System.out.println(kidsWithCandies(candies, extraCandies));

    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list =  new ArrayList<>();
        int max_candies = Integer.MIN_VALUE;

        int j = 0;
        for(int i = 1;i<candies.length;i++){
            if(candies[i] > candies[j]){
                max_candies = i;
            }
        }

        for(int i = 0;i<candies.length;i++){
            if(candies[i] + extraCandies > max_candies){
                list.add(true);
            }else {
                list.add(false);
            }
        }

      return list;
    }
}
