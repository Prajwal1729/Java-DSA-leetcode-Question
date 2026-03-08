package Leetcode;

public class problem165 {

    public static void rotateImage(int arr[][]){
       int m = arr.length;

       for(int i = 0;i<(m+1)/2;i++){
         for(int j = 0;j<(m/2);j++){
            int temp = arr[m-1-j][i];

            arr[m-1-j][i] = arr[m-1-i][m-j-1];
            arr[m-1-i][m-j-1] = arr[j][m-1-i];
            arr[j][m-1-i] = arr[i][j];
            arr[i][j] = temp;

         }
       }

    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        
    }
}
