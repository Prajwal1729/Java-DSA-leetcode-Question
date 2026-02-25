package Leetcode;
import java.util.ArrayList;
import java.util.List;


public class problem157 {

    public static List<List<String>> NQueens(int n){
       char[][] board = new char[n][n];
       for(int i = 0;i<n;i++){
           for(int j = 0;j<n;j++){
             board[i][j] = '.';
           }
       }
       List<List<String>> res = new ArrayList<>();
       backTrack(board,0,res);
       return res;
    }

    public static void backTrack(char[][] board,int col,List<List<String>> res){
        if(col == board.length){
            res.add(construct(board));
            return;
        }

        for(int i = 0;i<board.length;i++){
            if(isValid(board,i,col)){
                board[i][col] = 'Q';
                backTrack(board, col+1, res);
                board[i][col] = '.';
            }
        }
    }

    public static boolean isValid(char [][] board,int row,int col){
         for(int i =0;i<col;i++){
            if(board[i][col] == 'Q'){
                return false;
            }
         }

         for(int i = row,j=col;i>=0 && j>=0;i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
         }

         for(int i = row,j=col;i<board.length && j>=0;i++,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
         }

         return true;
    }

    public static List<String> construct(char [][] board){
        List<String> res = new ArrayList<>();
        for(int i = 0;i<board.length;i++){
            String row = new String(board[i]);
            res.add(row);
        }

        return res;
    }

    public static void main(String[] args) {
        // N-Queens //
        int n = 4;
        List<List<String>> res = NQueens(n);
        System.out.println(res);


    }
}
