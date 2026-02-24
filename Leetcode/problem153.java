package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class problem153 {

    public static String [] mapping = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public static List<String> letterCombinationPhoneNumber(String s){
      List<String> combination = new ArrayList<>();
      if(s==null || s.length() == 0){
        return combination;
      }

      backTrack(combination,s,"",0);
      return combination;
       
    }

    public static void backTrack(List<String> combination,String s,String currCombination,int idx){
        if(idx == s.length()){
            combination.add(currCombination);
            return;
        }

        String letters = mapping[s.charAt(idx) - '0'];
        for(char letter: letters.toCharArray()){
           backTrack(combination, s, currCombination+letter, idx+1);
        }
    }
    public static void main(String[] args) {
        // letter combination of phone number //
        String s = "246";
        List<String> res = letterCombinationPhoneNumber(s);
        System.out.println(res);
        


        
    }
}
