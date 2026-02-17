package Leetcode;

import java.util.ArrayList;
import java.util.List;



public class problem64 {

    public List<String> genrateParentheses(int n){
       
       List<String> ans = new ArrayList<>();
       backTrack(ans, new StringBuilder(), 0,0, n);
       return ans;
    }

    public void backTrack(List<String> ans,StringBuilder curr,int open,int close,int max){
        if(curr.length()==2*max){
            ans.add(curr.toString());
            return;
        }
        if(open<max){
            curr.append('(');
            backTrack(ans, curr, open-1, close, max);
            curr.deleteCharAt(curr.length()-1);
        }
        if(close<max){
            curr.append(')');
            backTrack(ans, curr, open, close-1, max);
            curr.deleteCharAt(curr.length()-1);
        }
        
    }
    public static void main(String[] args) {
        int n = 2;
        List<String> res = new problem64().genrateParentheses(n);
        System.out.println(res);
    }
}
