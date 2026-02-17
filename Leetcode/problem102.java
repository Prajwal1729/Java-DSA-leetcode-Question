package Leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class problem102 {

    public static int noProvinces(int [][] isConnected){
        int n = isConnected.length;
        boolean vis[] = new boolean[n];
        int provinces = 0;

        for(int i = 0;i<n;i++){
            if(!vis[i]){
                bfs(isConnected,vis,i);
                provinces++;
            }
        }

        return provinces;

    }

    public static void bfs(int [][] isConnected,boolean vis[],int start){
        Queue<Integer> q = new LinkedList<>();
        q.poll();
        vis[start] = true;

        while(!q.isEmpty()){
            int city = q.poll();
            for(int i =0;i<isConnected.length;i++){
                if(isConnected[city][i] == 1 && !vis[i]){
                    vis[i] = true;
                    q.offer(i);
                }
            }
        }

    }

    public static void main(String[] args) {
        // Graph DS //
        int arr[][] = {{1,1,0},{1,1,0},{0,0,1}};

        int noOfProvinces = noProvinces(arr);
        System.out.println("The no.of provinces is: "+ noOfProvinces);


    }
}
