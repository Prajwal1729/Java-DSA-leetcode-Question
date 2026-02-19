package Leetcode;

public class problem143 {

    public static boolean validParenthesis(String s){
        int n = s.length();
        int maxOpen = 0;
        int minOpen = 0;

        for(int i = 0;i<n;i++){
            char c = s.charAt(i);

            if(c == '('){
                maxOpen++;
                minOpen++;
            }
            else if(c == ')'){
                maxOpen--;
                minOpen--;
            }

            else{
              minOpen--;
              maxOpen++;
            }

            if(maxOpen < 0){
                return false;
            }
           
            minOpen = Math.max(minOpen,0);


        }
        return minOpen == 0;
    }
    public static void main(String[] args) {
        String s = "((**)";
        boolean res = validParenthesis(s);
        System.out.println(res);
    }
}
