package Leetcode;

import java.util.ArrayList;
import java.util.HashMap;


public class problem121 {

    public static HashMap<Character,List<Character>> reverseList = new HashMap<>();
    public static HashMap<Character,Boolean > seen = new HashMap<>();
    public static StringBuilder res = new StringBuilder();

    public static String alienWords(String [] words){

        for(String word : words){
           for(char c: word.toCharArray()){
              reverseList.putIfAbsent(c, new ArrayList<>());
           }

           for(int i = 0;i<words.length;i++){
             String w1 = words[i];
             String w2 = words[i+1];

             if(w1.length() > w2.length() && w1.startsWith(w2)){
                return "";
             }

             for(int j = 0;j<Math.min(w1.length(),w2.length()); j++){
                if(w1.charAt(j)!=w2.charAt(j)){
                    reverseList.get(w2.charAt(j)).add(w1.charAt(j));
                    break;
                }
             }
           }

           for(Character c: reverseList.keySet()){
             boolean res = dfs(c);
             if(res) return "";
           }

           if(output.length() < reverseList.size()){
             return "";
           }

           return output.toString();
    }
}

    public static boolean dfs(Character c){
        if(seen.containsKey(c)){
            return seen.get(c);
        }

        seen.put(c,false);

        for(Character next: reverseList.get(c)){
            boolean res = dfs(next);
            if(!res) return false;
        }

        seen.put(c,true);
        output.append(c);
        return true;
    }
    public static void main(String[] args) {
        
        String [] words = {"Wrt","Wrf","er","ett","rftt"};
    }
}
