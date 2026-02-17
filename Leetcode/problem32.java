package Leetcode;

public class problem32 {

    public static int binarySearch1(int arr[],int tar){
        int n = arr.length;

        int l = 0;
        int r = n-1;

        while(l<=r){

            int mid = (l+r)/2;
            if(arr[mid] == tar){
                return mid;
            }
            else if(arr[mid]<tar){
                l = mid+1;
            }
            else{
                r = mid-1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        
        // sorting and searching //

        int nums[] = {1,2,3,5,7,9};
        int tar = 9;

        int res = binarySearch1(nums, tar);
        if(res!=-1){
          System.out.println("The element lie at the index position: "+ res);
        }
    }
}
