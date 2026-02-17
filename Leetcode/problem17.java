package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class problem17 {

    public static String minimumWindowString(String s,String t){
        int n1 = s.length();
        int n2 = t.length();
        int l =0;
        int r = 0;
        int create = 0;
        int ans[] = {-1,0,0};
       
        if(n1 < n2 || n1==0 || n2==0){
            return "";
        }

        Map<Character,Integer> map = new HashMap<>();

        for(int i=0;i<n2;i++){
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0) + 1);
        }

        int req = map.size();

         Map<Character,Integer> substringmap = new HashMap<>();
        while(r < n1){
            char c = s.charAt(r);
            int count = substringmap.getOrDefault(c,0);
            substringmap.put(c,count+1);
            if(map.containsKey(c) && substringmap.get(c).intValue() == map.get(c).intValue()){
                create++;
            }

            while(l<=r && req==create){
               c = s.charAt(l);
               if(ans[0] == -1 || ans[0] >= r-l+1){
                ans[0] = r-l+1;
                ans[1] = l;
                ans[2] = r;
               }

               substringmap.put(c,substringmap.get(c)-1);

               if(map.containsKey(c) && substringmap.get(c).intValue() < map.get(c).intValue()){
                  create--;
               }
               l++;
            }
            r++;
        }

        if(ans[0] == -1){
            return "";
        }

        return s.substring(ans[1],ans[2]+1);
        
    }
    public static void main(String[] args) {
       
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String res = minimumWindowString(s, t);
        System.out.println("The minimum window substring is: "+ res);
    }
}
