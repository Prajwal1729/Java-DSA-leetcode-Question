package Leetcode;
import java.util.Scanner;

public class problem25 {

    public static String[] fizzBuzz(int n){
        if(n%3==0 && n%5==0){
            String ans = "FizzBuzz";
            return new String[]{ans};
        }

        else if(n%3==0){
            String ans = "Fizz";
            return new String[]{ans};
        }
        else if(n%5==0){
            String ans = "Buzz";
            return new String[]{ans};
        }

       else{
         String ans = Integer.toString(n);
         return new String[]{ans};
       }

    }
    public static void main(String[] args) {
         System.out.println("Please enter the value of n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String res[] = fizzBuzz(n);
        
        for(int i =0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
        System.out.println();
    }
}
