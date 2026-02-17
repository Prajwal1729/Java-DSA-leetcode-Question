package Leetcode;

public class problem37 {

    public static boolean twoDimMat(int nums[][],int tar){
       
      int m = nums.length;
      int n = nums[0].length;

      int l = 0;
      int r = m*n -1;

      while(l<=r){
        int mid = (l+r)/2;
        int midElement = nums[mid/n][mid%n];

        if(midElement==tar){
            return true;
        }
        else if(midElement<tar){
            l = mid+1;
        }
        else{
            r = mid-1;
        }
       
      }

      return false;

    }
    public static void main(String[] args) {
        int mat[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int tar = 3;

        boolean res = twoDimMat(mat, tar);
        System.out.println(res);

        
    }
}
