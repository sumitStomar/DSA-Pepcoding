import java.util.Scanner;

public class decimalToAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
   }
  
   public static int getValueInBase(int n, int b){
       // write code here
       int res = 0;
       int multiplier = 1;
       while(n != 0){
           int remainder = n % b;
           n /= b;

           res = res  + remainder * multiplier;
           multiplier *= 10;
       }
       return res;
   }
  }