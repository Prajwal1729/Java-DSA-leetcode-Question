package Leetcode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class problem151 {

    public static List<List<Integer>> allPossibleSubsetsII(int nums[]){
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        genrateAllPossibleSubsetsII(res,nums,new ArrayList<>(),0);
        return res;
    }

    public static void genrateAllPossibleSubsetsII(List<List<Integer>> res,int nums[],List<Integer> curr,int idx){
        res.add(new ArrayList<>(curr));

        for(int i = idx;i<nums.length;i++){
            if(i > idx && nums[i] == nums[i-1]){
                continue;
            }

            curr.add(nums[i]);
            genrateAllPossibleSubsetsII(res,nums, curr, idx+1);
            curr.remove(curr.size() - 1);
        }

    }
    public static void main(String[] args) {
        int arr[] = {1,2,2};
        List<List<Integer>> res = allPossibleSubsetsII(arr);
        System.out.println(res);
    }
}
