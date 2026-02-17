package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class problem101 {

    static class TrieNode{
        Map<Character,TrieNode> children = new HashMap<>();
        boolean word = false;
        public TrieNode(){}

    }

    static class WordDictionary{
        static TrieNode trie;

        public WordDictionary(){
            trie = new TrieNode();

        }

        public static void addWord(String word){
            TrieNode node = trie;
            for(char ch: word.toCharArray()){
                if(!node.children.containsKey(ch)){
                    node.children.put(ch,new TrieNode());
                }
                node.children.get(ch);
            }

            node.word = true;
        }

        public static boolean searchInNode(String word,TrieNode node){
            for(int i = 0;i<word.length();i++){
                char ch = word.charAt(i);
                if(!node.children.containsKey(ch)){
                    if(ch == '.'){
                        for(char x: node.children.keySet()){
                            TrieNode child = node.children.get(x);
                            if(searchInNode(word.substring(i+1), child)){
                                return true;
                            }
                        }
                    }

                    else{
                        return false;
                    }
              
                }
                else{
                    node = node.children.get(ch);
                }

           }
           return node.word;
        }

        public static boolean search(String word){

            return searchInNode(word, trie);

        }
    }
    public static void main(String[] args) {
        
    }
}
