package Leetcode;

import java.util.PriorityQueue;

public class problem74 {

    public static int[][] kClosestPointsToOrigin(int points[][],int k){
          
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b)->Integer.compare(b[0] * b[0] + b[1]* b[1], a[0]*a[0] + a[1] * a[1]));

        for(int[] point: points){
            maxHeap.offer(point);

            if(maxHeap.size() > k){
                maxHeap.poll();
            }
        }

        int res[][] = new int[k][2];
        for(int i =0;i<k;i++){
            res[i] = maxHeap.poll();
        }

        return res;
    }
    public static void main(String[] args) {
        
        int points[][] = {{-3,3},{1,4},{3,3},{2,1},{-1,1},{-4,-3}};
        int k = 2;

        int res[][] = kClosestPointsToOrigin(points, k);
        System.out.println("The k closest points to origin are: ");

        for(int i = 0;i<res.length;i++){

            System.out.println("The two points closest to origin are: "+ res[i][0] + " "+ res[i][1]);
        }

    
        
    }
}
