package Leetcode;

public class problem99 {

    static class TrieNode{

        private static TrieNode[] links;
        private static final int R =26;
        private static boolean isEnd;


        public TrieNode(){
           links = new TrieNode[R];
        }

        public static boolean containsKey(char ch){
            return links[ch - 'a'] != null;
        }

        public static TrieNode get(char ch){
            return links[ch - 'a'];
        }

        public static void put(char ch,TrieNode node){
            links[ch - 'a'] = node;
        }

        public static void setEnd(){
            isEnd = true;
        }

        public static boolean isEnd(){
            return isEnd;
        }

    }

    static class Trie{

        private static TrieNode root;

        public Trie(){

            root = new TrieNode();
        }

        public static void insert(String word){
            TrieNode node = root;

            for(int i = 0;i<word.length();i++){
                char currch = word.charAt(i);
                if(TrieNode.containsKey(currch)){
                    TrieNode.put(currch,new TrieNode());
                }

                node = TrieNode.get(currch);
            }

            TrieNode.setEnd();
        }

        public static TrieNode searchPrefix(String word){
            TrieNode node = root;

            for(int i = 0;i<word.length();i++){
                char currch = word.charAt(i);
                if(TrieNode.containsKey(currch)){
                    TrieNode.get(currch);
                }

                else{
                    return null;
                }

                
            }

            return node;

        }

        public static boolean search(String word){

            TrieNode  node = searchPrefix(word);
            return node!=null && TrieNode.isEnd();

        }

        public static boolean startsWith(String prefix){

            TrieNode node = searchPrefix(prefix);
            return node!=null && TrieNode.isEnd();
        }


    }

    
    
    public static void main(String[] args) {
        
    }
}
