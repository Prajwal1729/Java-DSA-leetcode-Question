package Leetcode;

public class problem31 {

    public static int palindromicSubstring(String s){
        int n = s.length();

        if(n==0){
            return 0;
        }

        int count = 0;

        for(int center = 0;center<2*s.length()-1;center++){
            int left = center/2;
            int right = left + center %2;

            while(left>=0 && right<=s.length()-1 && s.charAt(left)==s.charAt(right)){
                left--;
                right++;
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        String str = "abc";
        int res = palindromicSubstring(str);
        System.out.println("The no.of palindromic substring in a string is: "+ res);
    }
}
