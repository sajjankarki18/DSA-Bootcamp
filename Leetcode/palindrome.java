package Leetcode;

public class palindrome {
    public static void main(String[] args) {
        int num = 121;

        System.out.println(isPalindrome(num));
    }
    public static boolean isPalindrome(int num){
        if(num < 0){
            return false;
        }

        int org_num = num;

        int reversedNum = 0;

        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num = num / 10;
        }

        if(reversedNum == org_num){
            return true;
        }

        return false;
    }
}
