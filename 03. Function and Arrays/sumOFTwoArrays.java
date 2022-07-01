import java.util.Scanner;

public class sumOFTwoArrays {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] one = new int[n1];
        for (int i = 0; i < one.length; i++) {
            one[i] = scn.nextInt();
        }

        int n2 = scn.nextInt();
        int[] two = new int[n2];
        for (int i = 0; i < two.length; i++) {
            two[i] = scn.nextInt();
        }

        // sum
        // another way..
        /*
         * int[] sum = null;
         * if(n2>n1){
         * sum = new int[n2];
         * }else{
         * sum = new int[n1];
         * }
         */

        int[] sum = new int[n2 > n1 ? n2 : n1]; // ternary operator

        int i = one.length - 1; // array1
        int j = two.length - 1; // array2
        int k = sum.length - 1; // sum of both array

        int c = 0;
        while (k >= 0) {
            int d = c; // carry

            if (i >= 0) {
                d = d + one[i];
            }

            if (j >= 0) {
                d = d + two[j];
            }

            c = d / 10;
            d = d % 10;
            sum[k] = d;

            i--;
            j--;
            k--;

        }

        if (c > 0) {
            System.out.println(c);
        }

        for (int x = 0; x < sum.length; x++) {
            System.out.println(sum[x]);
        }

    }

}
