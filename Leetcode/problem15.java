package Leetcode;

public class problem15 {

    public static int longestWithoutRepeatingCharacter(String s){
        int n = s.length();
        int smap[] = new int[26];

        if(n==0){
            return 0;
        }

        if(n==1){
            return 1;
        }

        int l=0,r=0;
        int ans = 0;
        for(;r<n;r++){
            smap[s.charAt(r) - 'a']++;

            while(smap[s.charAt(r) - 'a'] > 1){
               smap[s.charAt(l) - 'a']--;
               l++; 
            }
            ans = Math.max(ans,r-l+1);
        }

        return ans;


    }
    public static void main(String[] args) {
        String s = "abcabcbb";
        int res = longestWithoutRepeatingCharacter(s);
        System.out.println("The longest substring without repeating characters is: "+ res);

    }
}
