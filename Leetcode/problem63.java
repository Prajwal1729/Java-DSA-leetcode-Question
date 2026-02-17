package Leetcode;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class problem63 {

    public static String minremoveToMakeValidParenthesis(String s){
        Set<Integer> idx = new HashSet<>();
        Stack<Integer> st = new Stack<>();

        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch == '('){
                st.push(i);
            }
            else if(ch == ')'){
                if(st.isEmpty()){
                    idx.add(i);
                }
                else{
                    st.pop();
                }
            }
        }

        while(!st.isEmpty()){
            idx.add(st.pop());
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            if(!idx.contains(i)){
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();

    }
    public static void main(String[] args) {
        String str = "lee(t(c)o)de)";
        String res = minremoveToMakeValidParenthesis(str);
        System.out.println("the minimum to make the valid parenthesis is: "+ res);
    }
}
