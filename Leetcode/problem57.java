package Leetcode;

import java.util.HashMap;
import java.util.Stack;

public class problem57 {

    public static boolean validParentheses(String str){
        
        HashMap<Character,Character> mapChar = new HashMap<>();

        mapChar.put(')','(');
        mapChar.put('}','{');
        mapChar.put(']','[');

        Stack<Character> s = new Stack<>();

        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(!mapChar.containsKey(ch)){
                s.push(ch);
            }
            else{
                if(s.isEmpty()){
                    return false;
                }
                char topelement = s.pop();
                if(topelement != mapChar.get(ch)){
                    return false;
                }
            }
        }

        return s.isEmpty();

    }
    public static void main(String[] args) {
        // stack question //
        // valid parentheses //

        String str = "([{}])";
        boolean res = validParentheses(str);
        System.out.println(res);
    }
}
