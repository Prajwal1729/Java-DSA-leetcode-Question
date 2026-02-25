package Leetcode;
import java.util.ArrayList;
import java.util.List;

public class problem156 {

    public static List<List<String>> partition(String s){
        List<List<String>> res = new ArrayList<>();
        backTrack(res,new ArrayList<>(),s,0);
        return res;
    }

    public static void backTrack(List<List<String>> res,List<String> curr,String s,int start){
        if(start == s.length()){
           res.add(new ArrayList<>(curr));
           return;
        }

        for(int end = start;end<s.length();end++){
            if(isPalindrome(s,start,end)){
               curr.add(s.substring(start,end+1));
               backTrack(res, curr, s, end+1);
               curr.remove(curr.size()-1);
            }
        }
    }

    public static boolean isPalindrome(String s,int start,int end){
        while(start < end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
         String s = "aab";
         List<List<String>> res = partition(s);
         System.out.println(res);
    }
}
