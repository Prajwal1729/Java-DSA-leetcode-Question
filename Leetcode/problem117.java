package Leetcode;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.List;
import java.util.Arrays;

public class problem117 {

    public static int networkDelayTime(int [][]times,int n,int k){
        // create a graph represented as adjancency list //
        Map<Integer,List<int[]>> graph = new HashMap<>();
        for(int[] edge: times){
            graph.computeIfAbsent(edge[0],x-> new ArrayList<>()).add(new int[]{edge[1],edge[2]});
        }
        
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a->a[1]));
        pq.offer(new int[]{k,0});

        int dist[] = new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[k] = 0;

        while(!pq.isEmpty()){
            int [] curr = pq.poll();
            int currnode = curr[0];
            int currdist = curr[1];
        
            if(currdist > dist[currnode]){
                continue;
            }

            if(graph.containsKey(currnode)){
                 for(int [] neigh: graph.get(currnode)){
                    int nextnode = neigh[0];
                    int nextdist = currdist + neigh[1];
                    if(nextdist < dist[nextnode]){
                        dist[nextnode] = nextdist;
                        pq.offer(new int[]{currnode,nextdist});
                    }
                 }
            }
        }

        int maxdist = Arrays.stream(dist).skip(1).max().getAsInt();
        return maxdist == Integer.MAX_VALUE ? -1: maxdist;
       
    }
    public static void main(String[] args) {
        // network delay time //

    }
}
