package Arrays;

public class Leetcode_1792 {
    public static void main(String[] args) {
        int [] nums = {-5,1,5,0,-7};
        System.out.println(largestAltitude(nums));

    }
    public static int largestAltitude(int [] nums){
        int currentAlt = 0;
        int largestAlt = 0;

        for(int i = 0;i<nums.length;i++){
            currentAlt += nums[i];

            if(currentAlt > largestAlt){
                largestAlt = currentAlt;
            }
        }

        return largestAlt;
    }
}
