package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class problem154 {

    public static List<List<Integer>> combinationSum(int nums[],int tar){
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> combination = new ArrayList<>();

        backTrack(tar,res,combination,0,nums);
        return res;
    }

    public static void backTrack(int tar,List<List<Integer>> res,List<Integer> combination,int start,int nums[]){
        if(tar==0){
            res.add(new ArrayList<>(combination));
        }

        else if(tar < 0){
            return;
        }
        for(int i=start;i<nums.length;i++){
            combination.add(nums[i]);
            backTrack(tar-nums[i], res, combination, i, nums);
            combination.remove(combination.size() - 1);
        }
    }
    public static void main(String[] args) {
        int [] candidates = {2,3,6,7};
        int tar = 7;
        List<List<Integer>> res = combinationSum(candidates, tar);
        System.out.println(res);
    }
}
