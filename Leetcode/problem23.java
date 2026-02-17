package Leetcode;

public class problem23 {

    public static int removeDuplicates(int nums[]){
        int n = nums.length;
        int insertedIndex = 1;

        for(int i =1;i<n;i++){
            if(nums[i-1]!=nums[i]){  // to remove the duplicates elements if we see any. //
               nums[insertedIndex] = nums[i];
               insertedIndex++;
            }
        }
        return insertedIndex;
    }
    public static void main(String[] args) {
        int nums[] = {0,0,1,2,2,3,3};
        int res = removeDuplicates(nums);
        
         System.out.println(res);
       
        
    }
}
