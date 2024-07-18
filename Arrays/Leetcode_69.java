package Arrays;

public class Leetcode_69 {
    public static void main(String[] args) {
        int x = 4;

        System.out.println(mySqrt(x));
    }
    public static int mySqrt(int x){
        if(x == 0){
            return 0;
        }

        if(x < 0){
            return -1;
        }

        long i = 0;

        while (i * i <= x){
            i++;
        }

        return (int) i - 1;
    }
}
