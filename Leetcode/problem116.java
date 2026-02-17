package Leetcode;

import java.util.List;

public class problem116 {

    public static int minimumNoOfTransformation(List<String> lst,String beginWord, String endWord){
          if(lst.size() == 0){
            return 0;
          }

          if(beginWord.length() == 0 && endWord.length()==0){
            return 0;
          }

          // difference between begin word to end word shoudl be of one character //
          
          int min = 0;
          for(String word: lst){
            if(isOneCharDiff(beginWord,word)){
                min++;
                beginWord = word;
            }
             if(beginWord.equals(endWord)){
                return min;
             }
            }
            return -1;
        }

        public static boolean isOneCharDiff(String word1,String word2){
            int diffcount = 0;
            for(int i = 0;i<word1.length();i++){
                if(word1.charAt(i)!=word2.charAt(i)){
                    diffcount++;
                }
            }

            return diffcount == 1;
        }
    
    public static void main(String[] args) {
        // tranformation sequence //

        List<String> lst = List.of("hit","hot","dot","dog","cog");
        String beginWord = "hit";
        String endWord = "cog";
        int min = minimumNoOfTransformation(lst,beginWord,endWord);
        System.out.println(min);
    }
}
