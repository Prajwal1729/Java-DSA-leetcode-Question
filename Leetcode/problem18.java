package Leetcode;

public class problem18 {

    public static boolean validPalindrome(String str){
        int n = str.length();
        int l = 0;
        int r = n-1;

        while(l<r){
            while(l<r && !Character.isLetterOrDigit(str.charAt(l))){
                l++;
            }

             while(l<r && !Character.isLetterOrDigit(str.charAt(r))){
                r--;
            }

            if(Character.toLowerCase(str.charAt(l)) != Character.toLowerCase(str.charAt(r))){
                return false;
            }
            l++;
            r--;
        }

        return true;

    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean res = validPalindrome(s);
        System.out.println(res);
    }
}
