package Leetcode;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class problem20 {

    public static List<List<Integer>> ThreeSum(int nums[]){
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();

        for(int i =0;i<n && nums[i]<=0;i++){
           if(i==0 || nums[i]!=nums[i-1]){
             twoSumII(nums,i,res);
           }
        }

        return res;
      
    }

    private static void twoSumII(int nums[],int i,  List<List<Integer>> res ){
        int l = i+1;
        int r = nums.length - 1;

        while(l<r){
            int sum = nums[i] + nums[l] + nums[r];
            if(sum < 0){
                l++;

            }
            else if(sum>0){
                r--;
            }
            else{
                res.add(Arrays.asList(nums[i],nums[l],nums[r]));
                while(l<r && nums[l] == nums[l-1]){
                    ++l;
                }
            }
        }
    }
    public static void main(String[] args) {
        int nums[] = {-1,0,1,2,-1,-4};
        List<List<Integer>> res = ThreeSum(nums);
        
        for(int i=0;i<res.size();i++){
            for(int j =0;j<res.get(i).size();j++){
                System.out.print(res.get(i).get(j)+" ");
            }
        }

        System.out.println();


    }
}
