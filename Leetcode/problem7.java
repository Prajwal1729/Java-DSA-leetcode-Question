package Leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class problem7 {

    public static int[] frequentElements(int nums[],int k){

       if(k == nums.length){
         return nums;
       }
        Map<Integer,Integer> map = new HashMap<>();

        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);

        }

        Queue<Integer> heap = new PriorityQueue<>(
            (a,b)-> map.get(a) - map.get(b)
        );

        for(int n: map.keySet()){
            heap.add(n);
            if(heap.size() > k){
                heap.poll();
            }
        }

        int ans[] = new int[k];
        for(int i=0;i<k;i++){
            ans[i] = heap.poll();
        }

        return ans;

    }
    public static void main(String[] args) {
        int arr[] = {1,1,1,2,2,3};
        int k = 2;

        int res[] = frequentElements(arr, k);

        for(int i = 0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
        System.out.println();
    }
}
