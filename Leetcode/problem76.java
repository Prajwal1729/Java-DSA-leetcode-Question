package Leetcode;

import java.util.PriorityQueue;

public class problem76 {

    class KthLargest{

        private static int k;
        private static PriorityQueue<Integer> minHeap;
        public KthLargest(int k,int nums[]){
            KthLargest.k = k;
            KthLargest.minHeap = new PriorityQueue<>(k);

            for(int num: nums){
                add(num);
            }
        }

        public static int add(int val){
           if(minHeap.size() < k){
               minHeap.offer(val);
           }
           else if(val > minHeap.peek()){
              minHeap.poll();
              minHeap.offer(val);
           }

           return minHeap.peek();
          
        }
    }
    public static void main(String[] args) {
        
    }
}
