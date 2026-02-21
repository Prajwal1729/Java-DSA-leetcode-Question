package Leetcode;
import java.util.ArrayList;
import java.util.List;

public class problem150 {

    public static List<List<Integer>> allPossibleSubsets(int nums[]){
        List<List<Integer>> res = new ArrayList<>();
        generateSubsets(0, nums, new ArrayList<>(),res);
        return res;

    }

    public static void generateSubsets(int idx,int nums[],List<Integer> curr,List<List<Integer>> res){
        res.add(new ArrayList<>(curr));
        for(int i = idx;i<nums.length;i++){
            curr.add(nums[i]);
            generateSubsets(i+1, nums, curr,res);
            curr.remove(curr.size() -1);
        }

    }
    public static void main(String[] args) {
        // Back Tracking //
        int arr[] = {1,2,3};
        List<List<Integer>> res = allPossibleSubsets(arr);
        System.out.println(res);


    }
}
