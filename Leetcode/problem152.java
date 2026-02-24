package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class problem152 {

    public static List<List<Integer>> allPossiblePermutations(int nums[]){
        List<List<Integer>> res = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        generatePermutations(res, new ArrayList<>(), nums, used);
        return res;
    }

    public static void generatePermutations(List<List<Integer>> res,List<Integer> curr,int nums[],boolean used[]){
        if(curr.size()==nums.length){
           res.add(new ArrayList<>(curr));
           return;
        }
        for(int i = 0;i<nums.length;i++){
            if(!used[i]){
                curr.add(nums[i]);
                used[i] = true;
                generatePermutations(res, curr, nums, used);
                used[i] = false;
                curr.remove(curr.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3};
        List<List<Integer>> res = allPossiblePermutations(nums);
        System.out.println(res);
    }
}
