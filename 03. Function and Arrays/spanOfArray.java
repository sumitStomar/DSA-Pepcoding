import java.util.Scanner;

public class spanOfArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); // scanner udhaya
        int n = scn.nextInt(); // n udhaya

        int[] arr = new int[n]; // array banaya
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt(); // array ko bhar liya
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }

        int span = max - min; //Difference
        System.out.println(span);
    }
}