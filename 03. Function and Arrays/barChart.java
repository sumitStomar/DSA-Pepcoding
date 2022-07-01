import java.util.Scanner;

public class barChart {
    public static void main(String[] args) {
        // divide the code in parts for better understanding
        // part 1
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        // part 2
        int max = arr[0]; // max baar pta chal jayega isse
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        for (int ht = max; ht >= 1; ht--) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= ht) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }

            System.out.println();
        }

    }

}
