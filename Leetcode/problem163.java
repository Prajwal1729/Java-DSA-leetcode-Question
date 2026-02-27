package Leetcode;

public class problem163 {

    public static int[][] setMatrixZeroes(int matrix[][]){
        int m = matrix.length;
        int n = matrix[0].length;

        boolean rows[] = new boolean[m];
        boolean cols[] = new boolean[n];

        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(matrix[i][j]== 0){
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }

        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
               if(rows[i] == true || cols[j] == true){
                   matrix[i][j] = 0;
               }
            }
        }


        return matrix;
    }
    
    public static void main(String[] args) {
       int arr[][] = {{1,1,1},{1,0,1},{1,1,1}};

       int res[][] = setMatrixZeroes(arr);
       for(int i = 0;i<res.length;i++){
        for(int j = 0;j<res.length;j++){
            System.out.print(res[i][j] + " ");
         }
         System.out.println();
     }

       
    }
}
