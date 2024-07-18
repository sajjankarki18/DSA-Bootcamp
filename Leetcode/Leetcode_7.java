package Leetcode;

public class Leetcode_7 {
    public static void main(String[] args) {
        int num = -123;

        System.out.println(reverse(num));
    }
    public static int reverse(int x) {

        int rev = 0;

        while (x != 0){
            int digits = x % 10;
            rev = rev * 10 + digits;
            x = x / 10;
        }

        return rev;
    }
}
