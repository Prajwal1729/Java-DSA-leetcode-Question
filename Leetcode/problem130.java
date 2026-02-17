package Leetcode;

public class problem130 {

    public static int maximumProductSubArray(int arr[]){
       int n = arr.length;

       int maxProduct = Integer.MIN_VALUE;
       int currProduct = 1;

       for(int i = 0;i<n;i++){
          currProduct*=arr[i];
          maxProduct = Math.max(maxProduct,currProduct);
       }

       return maxProduct;
    
    }
    public static void main(String[] args) {
        int arr[] = {2,3,-2,4};
        int res = maximumProductSubArray(arr);
        System.out.println(res);
    }

}