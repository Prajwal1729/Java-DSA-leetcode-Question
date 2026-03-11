package Leetcode;

public class problem168 {

    public static char[][] board;
    public static int rows;
    public static int cols;

    public static boolean wordPresent(char[][] board,String word){
        
        problem168.board = board;
        problem168.rows = board.length;
        problem168.cols = board[0].length;

        for(int i = 0;i<rows;i++){
            for(int j = 0;j<cols;j++){
                if(bactrack(i,j,word,0)){
                    return true;
                }
            }
        }
        return false;
    
    }

    public static boolean bactrack(int row,int col,String word,int idx){
        if(idx>=word.length()){
            return true;
        }

        if(row < 0 || row >=rows || col < 0 || col >= cols || problem168.board[row][col]!=word.charAt(idx)){
            return false;
        }

        int [] rowdir = {0,1,0,-1};
        int [] coldir = {1,0,-1,0};

        problem168.board[row][col] = '#';

        boolean ret = false;
        for(int d = 0;d<4;d++){
            ret = bactrack(row + rowdir[d], col + coldir[d], word, idx+1);
            if(ret){
                break;
            }
        }

        board[row][col] = word.charAt(idx);
        return ret;
    }
    public static void main(String[] args) {
        char[][]  inputBoard = {{'A','B','C','E','S','F','C','S','A','D','E','E'}};
        String word = "ABCCED";

        boolean res = wordPresent(inputBoard, word);
        System.out.println(res);
    }
}
