package Leetcode;

import java.util.PriorityQueue;

public class problem73 {

    public static int kthLargestElement(int arr[],int k){
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int e: arr){
            pq.offer(e);
        }

        if(!pq.isEmpty()){
            for(int i = 0;i<arr.length - k;i++){
                pq.poll();
            }
            return pq.peek();
        }

        return !pq.isEmpty() ? -1 : pq.poll();

    }
    public static void main(String[] args) {
        int nums[] = {4,2,6,1,7,3,2};
        int k = 3;

        int res = kthLargestElement(nums, k);
        System.out.println(res);
    }
}
