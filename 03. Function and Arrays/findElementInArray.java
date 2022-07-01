import java.util.Scanner;

public class findElementInArray {
    public static int findElement(int[] arr, int ele){
        for(int idx = 0; idx < arr.length; idx++){
            if(arr[idx] == ele){
                return idx;
            }
        }
        return -1;

    }

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];

    for(int i=0; i<arr.length; i++){
        arr[i] = scn.nextInt();
    }

    int ele = scn.nextInt();
    
    System.out.println(findElement(arr, ele));


 }

}

        
