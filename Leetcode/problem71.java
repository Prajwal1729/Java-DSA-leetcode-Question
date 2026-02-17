package Leetcode;

import java.util.ArrayDeque;
import java.util.Queue;

public class problem71 {

    public static String predictPartyVictory(String senate){
        int n = senate.length();

        Queue<Integer> r = new ArrayDeque<>();
        Queue<Integer> d = new ArrayDeque<>();

        for(int i = 0;i<n;i++){
            if(senate.charAt(i) == 'R'){
                r.offer(i);
            }
            else{
                d.offer(i);
            }
        }

        while(!r.isEmpty() && !d.isEmpty()){
            int ri = r.poll();
            int di = d.poll();

            if(ri < di){
                r.offer(ri + n);
            }
            else{
                d.offer(di + n);
            }
        }

        return r.isEmpty() ? "Dire" : "Radiant";
    }
    public static void main(String[] args) {
        
        String senate = "RDDDRRD";
        String res = predictPartyVictory(senate);
        System.out.println(res);
    }
}
