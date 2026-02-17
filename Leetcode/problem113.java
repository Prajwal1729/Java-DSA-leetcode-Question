package Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class problem113 {

    private static int WHITE = 1;
    private static int GRAY = 2;
    private static int BLACK = 3;

    static Boolean isPossible;
    static Map<Integer,Integer> color;
    static Map<Integer,List<Integer>> adjList;
    static List<Integer> topoLogicalSort;
    
    public static void noOfOrderings(int numofCourses){
         isPossible = true;
        color = new HashMap<>();
        adjList = new HashMap<>();
        topoLogicalSort = new ArrayList<>();


        for(int i = 0;i<numofCourses;i++){
            color.put(i,WHITE);
        }
    }

    public static void dfs(int node){
        if(!isPossible){
            return;
        }
        color.put(node,GRAY);

        for(int neigh: adjList.getOrDefault(node, new ArrayList<>())){
            if(color.get(neigh) == WHITE){
            dfs(neigh);
            }
            else if(color.get(neigh)== GRAY){
                isPossible = false;
            }
        }

        color.put(node,BLACK);
        topoLogicalSort.add(node);
    }

    public static int[] findOrder(int numofCourses,int preq[][]){
        noOfOrderings(numofCourses);

        for(int i = 0;i<preq.length;i++){
            int dest = preq[i][0];
            int src = preq[i][1];
            List<Integer> lst = adjList.getOrDefault(src, new ArrayList<>());
            lst.add(dest);
            adjList.put(src,lst);
        }

        for(int i = 0;i<numofCourses;i++){
            if(color.get(i) == WHITE){
                dfs(i);
            }
        }

        int order[];
        if(isPossible){
            order = new int[numofCourses];
            for(int i =0;i<numofCourses;i++){
                order[i] = topoLogicalSort.get(numofCourses - i -1);
            }
        }
        else{
            order = new int[0];
        }

        return order;
    }
    public static void main(String[] args) {
        
    }
}
