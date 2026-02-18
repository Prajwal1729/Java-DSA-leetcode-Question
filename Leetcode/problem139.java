package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class problem139 {

    public static List<Integer> partitionLabels(String s){
        int n = s.length();

        int lastoccurence[] = new int[26];

        for(int i = 0;i<n;i++){
            lastoccurence[s.charAt(i) - 'a'] = i;
        }

        List<Integer> res = new ArrayList<>();
         int partend = 0;
         int partstart = 0;

        for(int i = 0;i<n;i++){
            partend = Math.max(partend,lastoccurence[s.charAt(i) - 'a']);

            if(i == partend){
              res.add(partend - partstart+1);
              partstart = i+1;
            }
        }

        return res;


    }
    public static void main(String[] args) {
        String s = "abad";
        List<Integer> res = partitionLabels(s);
        System.out.println(res);
    }
}
