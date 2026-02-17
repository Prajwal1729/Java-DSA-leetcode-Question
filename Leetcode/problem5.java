package Leetcode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Arrays;

public class problem5 {

    public static ArrayList<List<String>> groupAnagram(String[] strs){
        if(strs.length == 0){
            return new ArrayList<>();
        }

        Map<String, List<String>> map = new HashMap<>();

        int count[] = new int[26];

        for(String str: strs){
            Arrays.fill(count,0);

            for(char ch: str.toCharArray()){
               count[ch - 'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for(int i = 0;i<26;i++){
                sb.append("#");
                sb.append(count[i]);
            }
            String key = sb.toString();
            if(!map.containsKey(key)){
              map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }

        return new ArrayList<List<String>>(map.values());

    }
    public static void main(String[] args) {
        
        String arr[] = {"eat","tea","tan","ate","nat","bat"};
        ArrayList<List<String>> groupedAnagrams = groupAnagram(arr);
        System.out.print(groupedAnagrams);
    }
}
