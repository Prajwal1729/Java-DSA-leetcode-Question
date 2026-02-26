package Leetcode;

import java.util.HashSet;
import java.util.Set;

public class problem159 {
    public static boolean happyNumber(int n){
        if(n < 0){
            return false;
        }

       Set<Integer> setIntegers = new HashSet<>();

       while(n!=1 && !setIntegers.contains(n)){
         setIntegers.add(n);
         n = getSumOfSquares(n);
       }

       return n==1;

    }

    public static int getSumOfSquares(int n){
        int sum = 0;

        while(n > 0){
            int digit = n%10;
            sum+= digit*digit;
            n/=10;
        }

        return sum;
    }
   public static void main(String[] args) {
      // happy number //
      int n = 19;
      boolean res = happyNumber(n);
      System.out.println(res);


   }
}
