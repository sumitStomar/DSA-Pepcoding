import java.util.Scanner;

public class isANumberPrime{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = scn.nextInt();

            boolean isprime = true;

            for (int j = 2; j * j <= n; j++) {
                if (n % j == 0) {
                    isprime = false;
                    break;
                }
            }
            if (isprime == true) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        }
    }
}

/*
 * Other way with the use of function
 * 
 * import java.util.*;
 * 
 * public class Main {
 * 
 * public static boolean isprime(int num) {
 * for (int i = 2; i * i <= num ; i++) {
 * if ((num % i) == 0) {
 * return false;
 * }
 * 
 * }
 * return true;
 * }
 * 
 * public static void main(String[] args) {
 * Scanner scn = new Scanner(System.in);
 * int t = scn.nextInt();
 * while (t-- > 0) {
 * if (isprime(scn.nextInt())) {
 * System.out.println("prime");
 * } else {
 * 
 * System.out.println("not prime");
 * }
 * }
 * }
 * }
 */
