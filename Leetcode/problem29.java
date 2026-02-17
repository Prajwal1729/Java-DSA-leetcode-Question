package Leetcode;

public class problem29 {

    public static String longestPalindromicSubstring(String s){

        int n = s.length();

        if(n==0){
            return "";
        }

        int st = 0;
        int e = 0;
        int maxlen = 1;

        for(int center=0;center<2*s.length()-1;center++){
            int left = center/2;
            int right = left + center%2;

            while(left>=0 && right<=s.length()-1 && s.charAt(left) == s.charAt(right)){
                left--;
                right++;
                if(right-left+1>maxlen){
                    maxlen = right-left+1;
                    st = left+1;
                    e = right-1;
                }
            }
        }

        return s.substring(st,e+1);


    }
    public static void main(String[] args) {
        String s = "babad";
        String res = longestPalindromicSubstring(s);
        System.out.println("The longest palindromic substring of given string is: "+ res);
    }
}
