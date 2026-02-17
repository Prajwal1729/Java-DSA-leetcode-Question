package Leetcode;

import java.util.Stack;

public class problem65 {

    public static int longestValidParenthesesSubstring(String s){
      
       Stack<Integer> st = new Stack<>();

       int currLen = 0;
       int maxLen = 0;

       st.push(-1);

        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            
            if(ch=='('){
                st.push(i);
            }
            else{
            st.pop();
            if(st.isEmpty()){
                st.push(i);
            }
            else{
                currLen = i - st.peek();
                maxLen = Math.max(currLen,maxLen);
            }
            }
        }

      return maxLen;

    }

    public static void main(String[] args) {
        String s = "((()";
        int res = longestValidParenthesesSubstring(s);
        System.out.println("The length of longest valid parentheses substring is: "+ res);
    }
}
