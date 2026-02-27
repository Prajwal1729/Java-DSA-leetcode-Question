package Leetcode;

public class problem160 {

   public static double pow(double x, int n){
       if(n==0){
         return 1;
       }

       if(n < 0){
          x = (1/x);
          n = -n;
       }

       double res = 1;

       while(n > 0){
         if((n&1) == 1){
            res*=x;
         }
         x*=x;
         n>>=1;
       }

       return res;
   }
    public static void main(String[] args) {
        double x = 1.9;
        int n = 2;

        double res = pow(x, n);
        System.out.println(res);
    }
}
