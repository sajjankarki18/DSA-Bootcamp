package searching;

public class Leetcode_367 {
    public static void main(String[] args) {
        int num = 1;

        System.out.println(sqrt(num));
        System.out.println(isPerfectSquare(num));
        System.out.println(validPerfectSquare(num));

    }
    public static int sqrt(int num){
        if(num == 0){
            return 0;
        }

        long i = 1;

        while (i * i <= num){
            i++;
        }

        return (int) i - 1;
    }
    public static boolean validPerfectSquare(int num) {
        long i = 1;
        int ans = 0;

        while (i * i <= num){
            i++;
        }

        ans = (int) i;

        if(ans % 2 == 0){
            return true;
        }

        return false;
    }

    public static boolean isPerfectSquare(int num){
        if(num < 0){
            return false;
        }

        long i = 1;

        while (i * i <= num){
            if(i * i == num){
                return true;
            }

            i++;
        }
        return false;
    }
}
