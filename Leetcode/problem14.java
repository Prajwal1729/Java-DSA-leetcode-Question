package Leetcode;

public class problem14 {

    public static int longestRepeatingCharacter(String s,int k){
         
        int n = s.length();
        int l = 0,r =0;
        int ans = 0;
        int maxOccurence = 0;
        int smap[] = new int[26];

        for(;r<n;r++){
            maxOccurence = Math.max(maxOccurence,++smap[s.charAt(r) - 'A']);
            if (r - l + 1 - maxOccurence > k) {
                l++;
                smap[s.charAt(l) - 'A']--;
            }

            ans = Math.max(ans,r-l+1);
        }

        return ans;
    }
    public static void main(String[] args) {
        
        String s = "ABCAD";
        int k = 2;

        int res = longestRepeatingCharacter(s, k);
        System.out.println(res);
    }
}
