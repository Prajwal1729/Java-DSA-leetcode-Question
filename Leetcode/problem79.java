package Leetcode;

import java.util.PriorityQueue;

public class problem79 {

   static class MedianFinder{

        private static PriorityQueue<Integer> minHeap;
        private static PriorityQueue<Integer> maxHeap;

        public MedianFinder(){
           minHeap = new PriorityQueue<>();
           maxHeap = new PriorityQueue<>((a,b)-> b-a);
        }

        public static void addNum(int num){

            if(maxHeap.isEmpty() || num<=maxHeap.peek()){
                 maxHeap.offer(num);
            }
            else{
                minHeap.offer(num);
            }

            if(maxHeap.size() > minHeap.size() + 1){
                minHeap.offer(maxHeap.poll());
            }
          else if(minHeap.size() > maxHeap.size()){
              maxHeap.offer(minHeap.poll());
          }
        }

        public static double findMedian(){
           
            if(maxHeap.size() > minHeap.size()){
                return maxHeap.peek();
            }
            else{
                return (double)(maxHeap.peek() + minHeap.peek()) / 2.0;
            }
        }
    }
    public static void main(String[] args) {

        MedianFinder mf = new MedianFinder();
        MedianFinder.addNum(10);
        MedianFinder.addNum(20);
        // System.out.println("The median of the class is: "+ MedianFinder.findMedian());
        // MedianFinder.addNum(30);
        System.out.println("The median of the class is:  "+ MedianFinder.findMedian());
        
    }
}
