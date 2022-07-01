import java.util.Scanner;

public class anyBaseToDecimal{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int d = getValueIndecimal(n, b);
        System.out.println(d);
    }

    public static int getValueIndecimal(int n, int b) {
        // write your code here
        int res = 0;
        int multiplier = 1;
        while (n > 0) {
            int divisor = n / 10;
            int remainder = n % 10;

            n = divisor;
            res = res + remainder * multiplier;
            multiplier *= b;
        }
        return res;
    }
}