package Leetcode;

import java.util.ArrayDeque;
import java.util.Deque;


public class problem170 {

    public static class MovingAverage{
        public static int size=0, windowSum=0,count = 0;
       public static  Deque q = new ArrayDeque<>();

        public MovingAverage(int size){
           this.size = size;
        }

        public static double next(int val){
            q.add(val);
            int tail = count > size ?(int) q.poll() : 0;
            windowSum = windowSum - tail + val;

            return windowSum * 1.0 / Math.min(size,count);
        }

    }
    public static void main(String[] args) {
        
    }
}
