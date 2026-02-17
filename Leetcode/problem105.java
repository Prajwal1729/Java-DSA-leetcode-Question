package Leetcode;
import java.util.ArrayList;
import java.util.List;

public class problem105 {

    public static int noOfConnectedComponenents(int [][] edges,int n){
           int counter = 0;
           int vis[] = new int[n];

           List<List<Integer>> adjList = new ArrayList<>();

           for(int i = 0; i < n; i++){
               adjList.add(new ArrayList<Integer>());
           }

           for(int i = 0;i<edges.length;i++){
              adjList.get(edges[i][0]).add(edges[i][1]);
           }

           for(int i =0;i<n;i++){
                if(vis[i] == 0){
                  counter++;
                  dfs(adjList,vis,i);
                }
           }

           return counter;
    }   

    public static void dfs(List<List<Integer>> adjList,int vis[],int node){
        vis[node] = 1;
        for(int i = 0; i < adjList.get(node).size(); i++){
            if(vis[adjList.get(node).get(i)] == 0){
                dfs(adjList, vis, adjList.get(node).get(i));
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
