package Leetcode;

import java.util.PriorityQueue;

public class problem119 {

    static class Point{
        int index;
        int distance;

        public Point(int index, int distance) {
            this.index = index;
            this.distance = distance;
        }
    }

    // Prims Algorithm //

    public static int minimumCostsToConnectAllPoints(int points[][]){
       int n = points.length;
       PriorityQueue<Point> pq = new PriorityQueue<>((a,b)-> a.distance - b.distance);
       boolean [] isMst = new boolean[n];
       pq.offer(new Point(0,0));

       int minCost = 0;
       int pointsConnected = 0;

       while(pointsConnected < n){
         Point curr = pq.poll();
         if(isMst[curr.index]){
            continue;
         }

         isMst[curr.index] = true;
         minCost += curr.distance;
         pointsConnected++;

         for(int i = 0;i<n;i++){
            if(!isMst[i]){
                int distance = Math.abs(points[curr.index][0] - points[i][0]) + Math.abs(points[curr.index][1] - points[i][1]);
                pq.offer(new Point(i, distance));
            }
         }
       }

       return minCost;
    }
    public static void main(String[] args) {
        int arr[][] = {{0,0},{2,2},{3,10},{5,2},{7,0}};
        int res = minimumCostsToConnectAllPoints(arr);
        System.out.println(res);

    }
}
