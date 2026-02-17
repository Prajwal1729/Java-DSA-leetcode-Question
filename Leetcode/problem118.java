package Leetcode;

import java.util.Arrays;

public class problem118 {

    public static int cheapestFlightsKstops(int n, int [][] flights,int src,int dest,int k){
        int costs[] = new int[n];
        Arrays.fill(costs,Integer.MAX_VALUE);
        costs[src] = 0;

        for(int i=0;i<=k;i++){
            int temp[] = costs.clone();
            for(int flight[]: flights){
                int u = flight[0],v = flight[1],cost = flight[2];
                if(costs[u] == Integer.MAX_VALUE){
                    continue;
                }
                if(temp[v] > costs[u] + cost){
                    temp[v] = costs[u] + cost;
                }
            }
            costs = temp;
        }

        return costs[dest] == Integer.MAX_VALUE ?  -1: costs[dest];

    }
    public static void main(String[] args) {
        int src = 0;
        int dest = 3;
        int k = 1;
        int n = 4;

        int arr[][] = {{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
        int res = cheapestFlightsKstops(n,arr, src, dest, k);
        System.out.println(res);

    }
}
