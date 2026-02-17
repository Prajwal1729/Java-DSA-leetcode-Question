package Leetcode;

public class problem4 {

    public static boolean isAnagram(String s1,String s2){

        int n1 = s1.length();
        int n2 = s2.length();

        if(n1 != n2){
            return false;
        }

        int charCounts[] = new int[26];

        for(int i = 0;i<s1.length();i++){
            charCounts[s1.charAt(i) - 'a']++;
            charCounts[s2.charAt(i) - 'a']--;
        }

        for(int count: charCounts){
            if(count!=0){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        // anagram //

        String str1 = "cat";
        String str2 = "tac";

        boolean res = isAnagram(str1, str2);
        System.out.print(res);
    }
}
