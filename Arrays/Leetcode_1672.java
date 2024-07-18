package Arrays;

public class Leetcode_1672 {
    public static void main(String[] args) {
        int [][] accounts = {
                {1,5},
                {7,3},
                {3,5}
        };

        System.out.println(maximumWealth(accounts));
    }
    public static int maximumWealth(int [][] nums){
        int max_value = Integer.MIN_VALUE;

        for(int i = 0;i<nums.length;i++){
            int sum = 0;
            for(int j = 0;j<nums[i].length;j++){
                sum += nums[i][j];
            }
            if(sum > max_value){
                max_value = sum;
            }
        }

        return max_value;
    }
}
