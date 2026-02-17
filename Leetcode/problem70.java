package Leetcode;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;

public class problem70 {

    public static int openTheLock(String[] deadends,String tar){
        HashSet<String> dead  = new HashSet<>();
        if(dead.contains("0000")){
            return -1;
        }

        if("0000".equals(tar)){
            return 0;
        }

        Queue<String> q  = new ArrayDeque<>();
        HashSet<String> seen = new HashSet<>();
        q.offer("0000");
        seen.add("0000");

        int steps = 0;

        while(!q.isEmpty()){
            int size = q.size();

            for(int i = 0;i<size;i++){
                String curr = q.poll();
                if(dead.contains(curr)){
                    continue;   // skip the block states
                }
                if(curr.equals(tar)){
                    return steps;
                }
                char[] ch = curr.toCharArray();

                for(int j = 0;j<4;j++){
                    char org = ch[j];
                    int d = org - '0';

                    ch[j] = (char) ('0' + ((d+1) % 10));
                    String up = new String(ch);
                    if(!dead.contains(up) && seen.add(up)){
                        q.offer(up);
                    }

                    ch[j] = (char)('0' + ((d+9) % 10));
                    String down = new String(ch);
                    if(!dead.contains(down) && seen.add(down)){
                        q.offer(down);
                    }
                    ch[j] = org;
                }
            }
             steps++;
        }
        return -1;

    }
    public static void main(String[] args) {
        
        String deadends[] = {"0201","0101","0102","1212","2002"};
        String tar = "0202";

        int res = openTheLock(deadends, tar);
        System.out.println("The required combination to open the lock is: "+ res);


    }
}
