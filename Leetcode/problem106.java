package Leetcode;
import java.util.List;

public class problem106 {

    public static boolean isGraphValidTree(int n,List<List<Integer>> list){
        if(list.size() != n-1){
              return false;
        }
        boolean vis[] = new boolean[n];
        int count = 0;

        for(int i = 0;i < n;i++){
            if(!vis[i]){
                count++;
                dfs(list,vis,i);
            }
        }

        return count == 1;
    }

    public static void dfs(List<List<Integer>> list,boolean vis[],int node){
        vis[node] = true;

        for(int i =0;i<list.get(node).size();i++){
            if(!vis[list.get(node).get(i)]){
                dfs(list,vis,list.get(node).get(i));
            }
        }
    }
    public static void main(String[] args) {

       
        
    }
}
