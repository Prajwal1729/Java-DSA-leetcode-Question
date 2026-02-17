package Leetcode;

import java.util.LinkedList;
import java.util.Deque;

public class problem16 { 

    public static int [] maxSlidingWindow(int nums[],int k){
        int n = nums.length;
        if(nums == null || n==0 || k<=0){
            return new int[0];
        }

        int res[] = new int[n-k+1];
        Deque<Integer> dq = new LinkedList<>();

        for(int i =0;i<n;i++){
            while(!dq.isEmpty() && dq.peek() < i - k +1){
                dq.poll();
            }

            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i]){
                dq.pollLast();
            }

            dq.offer(i);

            if(i >=k-1){
                res[i-k+1] = nums[dq.peek()];
            }
        }

        return res;
    }
    public static void main(String[] args) {
        int nums[] = {1,3,-1,-3,5,3,6,7};
        int k = 3;

        int res[] = maxSlidingWindow(nums, k);

        for(int i =0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
        System.out.println();


    }
}
