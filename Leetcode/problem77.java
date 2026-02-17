package Leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class problem77 {

    public static int taskScheduler(char tasks[],int n){
        
        Map<Character,Integer> freqmap = new HashMap<>();

        for(char e: tasks){
            freqmap.put(e,freqmap.getOrDefault(e,0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> b-a);
        pq.addAll(freqmap.values());

        int time = 0;

        while(!pq.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            for(int i = 0;i<n+1;i++){
                if(!pq.isEmpty()){
                    temp.add(pq.poll());
                }
            }

            for(int freq: temp){
                if(--freq > 0){
                    pq.add(freq);
                }
            }
            time = pq.isEmpty() ? temp.size() : n+1;
        }
        return time;
    }
    public static void main(String[] args) {
        char tasks[] = {'A','A','B','A'};
        int n = 2;

        int res = taskScheduler(tasks, n);
        System.out.println(res);
    }
}
