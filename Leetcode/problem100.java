package Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class problem100 {

    static class TrieNode{
        HashMap<Character, TrieNode> children = new HashMap<>();
        String word = null;
        public TrieNode(){

        }

        public static List<String> ans = new ArrayList<>();
        char[][] board = null;
        private Object root;
        private static char[][] fullboard;

        public List<String> findWords(char[][] board,String [] words){
            TrieNode root = new TrieNode();

            for(String w: words){
                TrieNode node = root;
                for(Character letter: w.toCharArray()){
                       if(node.children.containsKey(letter)){
                          node = node.children.get(letter);
                       }

                       else{
                        TrieNode newNode = new TrieNode();
                         node.children.put(letter,newNode);
                       }
                }
                node.word = word;
            }

            this.fullboard = board;

            for(int row = 0;row<board.length;row++){
                for(int col = 0;col<board[0].length;col++){
                     backTracking(row,col,root);
                }
            }

            return ans;
        }

        public static void backTracking(int row,int col,TrieNode root){
             Character letter = fullboard[row][col];
             TrieNode parent = root;
             TrieNode currNode = parent.children.get(letter);

             if(currNode != null && currNode.word != null){
                 // Since ans is not static, you need to pass it as a parameter or make it static.
                 // Here, let's make ans static for simplicity.
                 ans.add(currNode.word);
                 currNode.word = null;
             }

             fullboard[row][col] = '#';

             int [] rowoffset = {-1,0,1,0};
             int [] coloffset = {0,1,0,-1};

             for(int i =0;i<4;i++){
                int newrow = row+rowoffset[i];
                int newcol = col+coloffset[i];

                if(newrow < 0 || newcol < 0 || newrow > fullboard.length || newcol > fullboard[0].length){
                    continue;
                }

                if(currNode.children.containsKey(fullboard[newrow][newcol])){
                    backTracking(newrow, newcol, currNode);
                }
             }

             fullboard[row][col] = letter;

        }
    }
    public static void main(String[] args) {
        
    }
}
