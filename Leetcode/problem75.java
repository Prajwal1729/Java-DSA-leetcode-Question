package Leetcode;

import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.Queue;
import java.util.List;

public class problem75 {

    public static int[][] highFive(int items[][]){
        
         Map<Integer,Queue<Integer>> scores = new TreeMap<>();

         for(int[] e: items){
             int id = e[0];
             int score = e[1];

             if(!scores.containsKey(id)){
                scores.put(id,new PriorityQueue<>((a,b)-> b-a));

             }
             scores.get(id).add(score);
         }

         List<int[]> ans = new ArrayList<>();
         for(int id: scores.keySet()){
             int sum = 0;
             for(int i =0;i<5;i++){
                sum = sum+scores.get(id).poll();
             }
             ans.add(new int[]{id,sum/5});
         }

         int[][] ansarray = new int[ans.size()][];

         return ans.toArray(ansarray);

    }
    public static void main(String[] args) {

        int items[][] = {{1,91},{1,92},{2,93},{2,97},{1,60},{2,77},{1,65},{1,87},{1,100},{2,100},{2,76}};
        int res[][] = highFive(items);

        for(int i =0;i<res.length;i++){
            System.out.println("The each student top five avaerage is: "+ res[i][0] + " "+ res[i][1]);
        }
        
    }
}
