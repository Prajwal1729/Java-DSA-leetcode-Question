package Leetcode;

import java.util.Arrays;

public class problem13 {

    public static boolean permutationString(String s1,String s2){
        int n1 = s1.length();
        int n2 = s2.length();

        if(n1 > n2){
            return false;
        }

        int s1map[] = new int[26];
        int s2map[] = new int[26];

        for(int i =0;i<n1;i++){
           s1map[s1.charAt(i) - 'a']++;
           s2map[s2.charAt(i) - 'a']++;
        }

        for(int i = 0;i<n2-n1;i++){
            if(matches(s1map,s2map)){
                return true;
            }

            s2map[s2.charAt(i+s1.length()) - 'a']++;
            s2map[s2.charAt(i) - 'a']--;
        }

        return matches(s1map,s2map);
    }
    // Helper method to compare two int arrays for equality
    private static boolean matches(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "bacdxz";

        boolean res = permutationString(s1, s2);
        System.out.println(res);
    }
}
