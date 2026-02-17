package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class problem8 {

  static Map<String,Integer> val = new HashMap<>();
    static {
        val.put("I",1);
        val.put("V",5);
        val.put("X",10);
        val.put("L",50);
        val.put("C",100);
        val.put("D",500);
        val.put("M",1000);
        val.put("IV",4);
        val.put("IX",9);
        val.put("XL",40);
        val.put("XC",90);
        val.put("CD",400);
        val.put("CM",900);
      }

    public static int romanToInteger(String str){

      int sum =0;
      int i = 0;

      while(i<str.length()){
        if(i<str.length() -1){
            String twoSymbols = str.substring(i,i+2);
            if(val.containsKey(twoSymbols)){
                sum+=val.get(twoSymbols);
                i = i+2;
                continue;
            }
        }
        String oneSymbol = str.substring(i,i+1);
        sum+=val.get(oneSymbol);
        i = i+1;
      }

      return sum;
    }
    public static void main(String[] args) {
        String s1 = "MDXLIX";
        int result = romanToInteger(s1);
        System.out.println(result);
        
    }
}
