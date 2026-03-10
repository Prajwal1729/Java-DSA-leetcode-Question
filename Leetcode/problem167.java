package Leetcode;

public class problem167 {

    public static void gameOfLife(int arr[][]){

        int m = arr.length;
        int n = arr[0].length;
 
        int neighbors[] = {0,1,-1};

        for(int row = 0;row<m;row++){
            for(int col = 0;col<n;col++){
                int liveneighbors = 0;
               
                for(int i = 0;i<3;i++){
                    for(int j = 0;j<3;j++){
                        if(!(neighbors[i] == 0 && neighbors[j]==0)){
                            int r = (row + neighbors[i]);
                            int c = (col + neighbors[j]);

                            if((r < m && r>=0) && (c < n && c>=0) && (Math.abs(arr[r][c])==1)){
                                 liveneighbors+=1;
                            }
                        }
                    }
                }

                if((arr[row][col] == 1 && (liveneighbors < 2 || liveneighbors > 3))){
                    arr[row][col] = -1;

                }

                if(arr[row][col] == 0 && liveneighbors == 3){
                    arr[row][col] = 2;
                }
            }
        }

        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
               if(arr[i][j] > 0){
                  arr[i][j] = 1;
               }
               else{
                arr[i][j] = 0;
               }
            }
        }

    }
    public static void main(String[] args) {
      // game of life //
    
    }
}
