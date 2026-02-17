package Leetcode;

import java.util.HashSet;

public class problem2 {


    public static boolean duplicateInt(int nums[]){
         HashSet<Integer> numbers = new HashSet<>();

         for(int num: nums){
            if(numbers.contains(num)){
                return true;
            }

            numbers.add(num);
         }
        return false;
    }
    public static void main(String[] args) {
        int nums[] = {1,4,3,5,4};
        boolean res = duplicateInt(nums);
        System.out.print(res);
        
    }
}
