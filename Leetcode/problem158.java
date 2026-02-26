package Leetcode;

public class problem158 {

    public static int[] largeInteger(int digits[]){
        int n = digits.length;
       for(int i = n-1;i>=0;i--){
          if(digits[i] < 9){
            digits[i]++;
            return digits;
          }

          digits[i] = 0;
       }

       int [] newdigits = new int[n+1];
       newdigits[0] = 1;
       return newdigits;
    }    
    public static void main(String[] args) {
        // Math and geometry //
        int digits[] = {9,5,2,3};

        int res[] = largeInteger(digits);
        for(int i = 0;i<res.length;i++){
            System.out.println(res[i]+" ");
        }

    }
}
