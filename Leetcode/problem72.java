package Leetcode;

import java.util.PriorityQueue;

public class problem72 {

    public static int lastStoneWeight(int wieghts[]){

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);

        for(int w: wieghts){
            pq.offer(w);
        }

        if(pq.size() > 1){
            int f = pq.poll();
            int s = pq.poll();

            if(f!=s){
                pq.offer(s-f);
            }
    
        }

       return pq.isEmpty() ? 0 : pq.poll();
    }
    public static void main(String[] args) {
        // priority queue //
        // PQ + HAEP

        // add,remove from root, delete, search //

        int wieghts[] = {4,2,6,1,7,3,2};
        int res = lastStoneWeight(wieghts);
        System.out.println("The weight of last remaining stone is: "+ res);

    }
}
