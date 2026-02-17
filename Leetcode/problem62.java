package Leetcode;

import java.util.Stack;

public class problem62 {

    public static int reversePolishNotation(String strs[]){

        Stack<Integer> s = new Stack<>();
        for(String token: strs){
           if(token.equals("+")){
             int b = s.pop();
             int a = s.pop();
             s.push(a+b);
           }
           else if(token.equals("-")){
            int b = s.pop();
            int a = s.pop();
            s.push(a-b);
           }
           else if(token.equals("/")){
            int b = s.pop();
            int a = s.pop();
            s.push(a/b);
           }
           else if(token.equals("*")){
            int b = s.pop();
            int a = s.pop();

            s.push(a*b);
           }
           else{
            s.push(Integer.parseInt(token));
           }
        }
        return s.pop();
    }
    public static void main(String[] args) {
        String tokens[] = {"2","1","+","3","+"};
        int res = reversePolishNotation(tokens);

        System.out.println(res);

    }
}
